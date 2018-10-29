package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.ProductContact;
import com.company.project.model.ProductEveryday;
import com.company.project.service.ProductEverydayService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/10/26.
*/
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
        productEverydayService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(ProductEveryday productEveryday) {
        productEverydayService.update(productEveryday);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestBody String  id) {
        ProductEveryday productEveryday = productEverydayService.findById(id);
        return ResultGenerator.genSuccessResult(productEveryday);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<ProductEveryday> list = productEverydayService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
    @PostMapping("/listAllDetail")
    public Result listAllDetail(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<ProductContact> list = productEverydayService.findContact();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
