package com.company.project.web;
import com.alibaba.fastjson.JSONObject;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Login;
import com.company.project.model.User;
import com.company.project.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
* Created by CodeGenerator on 2018/10/26.
*/
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/add")
    public Result add(@RequestBody User user) {
        try {
            boolean repeat = userService.checkUseName(user.getUsername());
            System.out.println(repeat);
            if(repeat==false){
                //false 为重复
                return  ResultGenerator.genFailResult("id_repeat");
            }else{
                //true 为不重复
                user.setUid(UUID.randomUUID().toString());
                userService.save(user);
                return ResultGenerator.genSuccessResult();
            }
        }catch (Exception e){
            return  ResultGenerator.genFailResult("error");
        }
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody String id) {
        try {
            String key = JSONObject.parseObject(id).getString("id");
            userService.deleteById(key);
            return ResultGenerator.genSuccessResult();
        }catch (Exception e){
            return  ResultGenerator.genFailResult("error");
        }
    }

    @PostMapping("/update")
    public Result update(@RequestBody User user) {
        try {
            userService.update(user);
            return ResultGenerator.genSuccessResult();
        }catch (Exception e) {
            return ResultGenerator.genFailResult("error");
        }
    }

    @PostMapping("/detail")
    public Result detail(@RequestBody String id) {
        try {
            String key = JSONObject.parseObject(id).getString("id");
            User user = userService.findById(key);
            return ResultGenerator.genSuccessResult(user);
        }catch (Exception e){
            e.printStackTrace();
            return  ResultGenerator.genFailResult("error");
        }
    }

    @PostMapping("/detailByUserName")
    public Result detailByUserName(@RequestBody String username) {
        try {
            String key = JSONObject.parseObject(username).getString("username");
            User user = userService.findBy("username",key);
            return ResultGenerator.genSuccessResult(user);
        }catch (Exception e){
            e.printStackTrace();
            return  ResultGenerator.genFailResult("error");
        }
    }


    @PostMapping("/login")
    public Result login(@RequestBody Login login) {
        try {
           String usename = login.getUsername();
           String password = login.getPassword();
           Login login1=userService.selectByUserNameAndPassword(usename,password);
           if(login1==null){
               return ResultGenerator.genSuccessResult();
           }else{
               return ResultGenerator.genSuccessResult(login1);
           }
        }catch (Exception e){
            e.printStackTrace();
            return  ResultGenerator.genFailResult("error");
        }
    }



    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        try{
            PageHelper.startPage(0, 0);
            List<User> list = userService.findAll();
            PageInfo pageInfo = new PageInfo(list);
            return ResultGenerator.genSuccessResult(pageInfo);
        }catch (Exception e){
            return  ResultGenerator.genFailResult("list_error");
        }
    }
}
