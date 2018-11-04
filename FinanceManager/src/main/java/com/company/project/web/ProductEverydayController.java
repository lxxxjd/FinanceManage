package com.company.project.web;
import com.alibaba.fastjson.JSONObject;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.ProductContact;
import com.company.project.model.ProductEveryday;
import com.company.project.model.ProductEverydayAndTime;
import com.company.project.service.ProductEverydayService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/10/26.
*/
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/product/everyday")
public class ProductEverydayController {
    @Resource
    private ProductEverydayService productEverydayService;

    @PostMapping("/add")
    public Result add(ProductEveryday productEveryday) {
        productEverydayService.save(productEveryday);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody String  id) {
        String key = JSONObject.parseObject(id).getString("id");
        ProductEveryday productEveryday = productEverydayService.findById(key);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(ProductEveryday productEveryday) {
        productEverydayService.update(productEveryday);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestBody String  fpid) {
        try {
            String key = JSONObject.parseObject(fpid).getString("fpid");
            ProductContact productContact = productEverydayService.findContactById(key);
            return ResultGenerator.genSuccessResult(productContact);
        }catch (Exception e){
            return ResultGenerator.genFailResult("error");
        }
    }


    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        try {
            PageHelper.startPage(page, size);
            List<ProductEveryday> list = productEverydayService.findAll();
            PageInfo pageInfo = new PageInfo(list);
            return ResultGenerator.genSuccessResult(pageInfo);
        }catch (Exception e){
            return ResultGenerator.genFailResult("error");
        }
    }
    @PostMapping("/listAllDetail")
    public Result listAllDetail(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        try {
            PageHelper.startPage(page, size);
            List<ProductContact> list = productEverydayService.findContact();
            PageInfo pageInfo = new PageInfo(list);
            return ResultGenerator.genSuccessResult(pageInfo);
        }catch (Exception e){
            return ResultGenerator.genFailResult("error");
        }
    }

    @PostMapping("/listOneWeekRate")
    public Result findProductByProductId(@RequestBody  String fpid){
        try {
            String key = JSONObject.parseObject(fpid).getString("fpid");
            PageHelper.startPage(0, 0);
            List<ProductEverydayAndTime> list = productEverydayService.findProductByProductId(key);
            PageInfo pageInfo = new PageInfo(list);
            return ResultGenerator.genSuccessResult(pageInfo);
        }catch (Exception e){
            e.printStackTrace();
            return ResultGenerator.genFailResult("error");
        }
    }
}
