package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.BuyProduct;
import com.company.project.model.Orders;
import com.company.project.model.UserHold;
import com.company.project.service.UserHoldService;
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
        try {
            UserHold userHold = userHoldService.findByUidAndFpid(buyProduct.getUid(),buyProduct.getFpid());
            if(userHold!=null){
                userHold.setHoldMoney(userHold.getHoldMoney()+buyProduct.getBuyMoney());
                userHoldService.update(userHold);
            }else {
                userHold = new UserHold(UUID.randomUUID().toString(), buyProduct.getFpid(), buyProduct.getUid(), buyProduct.getBuyMoney(),0.0, 0.0);
                userHoldService.save(userHold);
                Orders orders =new Orders(UUID.randomUUID().toString(), buyProduct.getUid(), buyProduct.getFpid(),
                        "买入", new Date(), "余额买入", "余额",buyProduct.getBuyMoney(), "交易完成", new Date());
            }
            return ResultGenerator.genSuccessResult(userHold);
        }catch (Exception e){
            return ResultGenerator.genFailResult("error");
        }

    }



}
