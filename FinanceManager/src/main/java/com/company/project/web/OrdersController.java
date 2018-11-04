package com.company.project.web;
import com.alibaba.fastjson.JSONObject;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.OrderAndNameTime;
import com.company.project.model.Orders;
import com.company.project.model.User;
import com.company.project.service.OrdersService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
* Created by CodeGenerator on 2018/10/29.
*/
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Resource
    private OrdersService ordersService;

    @PostMapping("/add")
    public Result add(@RequestBody Orders orders) {
        orders.setOid(UUID.randomUUID().toString());
        orders.setCreateTime(new Date());
        ordersService.save(orders);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam String id) {
        ordersService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Orders orders) {
        ordersService.update(orders);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam String id) {
        Orders orders = ordersService.findById(id);
        return ResultGenerator.genSuccessResult(orders);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        try {
            PageHelper.startPage(0, 0);
            List<Orders> list = ordersService.findAll();
            PageInfo pageInfo = new PageInfo(list);
            return ResultGenerator.genSuccessResult(pageInfo);
        } catch (Exception e) {
            return ResultGenerator.genFailResult("list_error");
        }
    }

        @PostMapping("/orderByUID")
        public Result orderByUID(@RequestBody String uid){
            try {
                String key = JSONObject.parseObject(uid).getString("uid");
                List<OrderAndNameTime> orders = ordersService.findByUid(key);
                return ResultGenerator.genSuccessResult(orders);
            } catch (Exception e) {
                e.printStackTrace();
                return ResultGenerator.genFailResult("error");
            }
        }
    }

