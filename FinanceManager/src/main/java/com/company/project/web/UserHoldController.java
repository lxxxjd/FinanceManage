package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.BuyProduct;
import com.company.project.model.UserHold;
import com.company.project.service.UserHoldService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/10/26.
*/
@RestController
@RequestMapping("/user/hold")
public class UserHoldController {
    @Resource
    private UserHoldService userHoldService;

    @PostMapping("/add")
    public Result add(UserHold userHold) {
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
        PageHelper.startPage(page, size);
        List<UserHold> list = userHoldService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @PostMapping("/buyProduct")
    public Result buy(@RequestBody BuyProduct buyProduct) {
        System.out.println(buyProduct.getFpid());
        System.out.println(buyProduct.getBuyMoney());
        UserHold userHold = userHoldService.findBy("uhid",buyProduct.getFpid());
        if(userHold!=null){
            userHold.setHoldMoney(userHold.getHoldMoney()+buyProduct.getBuyMoney());
            System.out.println(userHold.toString());
            userHoldService.update(userHold);
        }else {
           // System.out.println(userHold.toString());
        }
        return ResultGenerator.genSuccessResult(userHold);
    }



}
