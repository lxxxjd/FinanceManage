package com.company.project.web;
import com.alibaba.fastjson.JSONObject;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.BuyProduct;
import com.company.project.model.Orders;
import com.company.project.model.UserHold;
import com.company.project.service.UserHoldService;
import com.company.project.utils.DateUitls;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
* Created by CodeGenerator on 2018/10/26.
*/
@RestController
@RequestMapping("/user/hold")
public class UserHoldController {
    @Resource
    private UserHoldService userHoldService;

    @PostMapping("/add")
    public Result add(@RequestBody UserHold userHold) {
        userHold.setUhid(UUID.randomUUID().toString());
        userHoldService.save(userHold);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody String id) {
        userHoldService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(UserHold userHold) {
        userHoldService.update(userHold);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestBody String id) {
        UserHold userHold = userHoldService.findById(id);
        return ResultGenerator.genSuccessResult(userHold);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        try {
            PageHelper.startPage(page, size);
            List<UserHold> list = userHoldService.findAll();
            PageInfo pageInfo = new PageInfo(list);
            return ResultGenerator.genSuccessResult(pageInfo);
        } catch (Exception e) {
           return ResultGenerator.genFailResult("error");
        }

    }

    @PostMapping("/buyProduct")
    public Result buy(@RequestBody BuyProduct buyProduct) {
        try {
            //增加持有的钱的数量
            UserHold resultHold = userHoldService.addHold(buyProduct);
            //增加一个订单
            boolean result = userHoldService.saveOrder(buyProduct,"买入");
            //返回结果
            if(result == true&&resultHold != null)
                return ResultGenerator.genSuccessResult(resultHold);
            else{
                return ResultGenerator.genFailResult("error");
            }
        }catch (Exception e){
            return ResultGenerator.genFailResult("error");
        }
    }

    @PostMapping("/userholdByUID")
    public Result userholdByUID(@RequestBody String uid){
        try {
            String key = JSONObject.parseObject(uid).getString("uid");
            List<UserHold> userHolds = userHoldService.findByUid(key);
            return ResultGenerator.genSuccessResult(userHolds);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultGenerator.genFailResult("error");
        }
    }

    @PostMapping("/saleProduct")
    public Result sale(@RequestBody BuyProduct buyProduct) {
        try {
            //减少持有的钱的数量
            UserHold result = userHoldService.saleHold(buyProduct);
            //增加一个订单
            boolean result2 = userHoldService.saveOrder(buyProduct,"卖出");
            //返回结果
            if (result !=null && result2 ==true)
                return ResultGenerator.genSuccessResult(result);
            else {
                return ResultGenerator.genFailResult("error2");
            }
        } catch (Exception e) {
            return ResultGenerator.genFailResult("error");
        }
    }

}
