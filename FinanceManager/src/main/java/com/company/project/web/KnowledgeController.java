package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Knowledge;
import com.company.project.service.KnowledgeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/10/26.
*/
@RestController
@RequestMapping("/knowledge")
public class KnowledgeController {
    @Resource
    private KnowledgeService knowledgeService;

    @PostMapping("/add")
    public Result add(Knowledge knowledge) {
        knowledgeService.save(knowledge);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody String id) {
        knowledgeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Knowledge knowledge) {
        knowledgeService.update(knowledge);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestBody String id) {
        Knowledge knowledge = knowledgeService.findById(id);
        return ResultGenerator.genSuccessResult(knowledge);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Knowledge> list = knowledgeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
