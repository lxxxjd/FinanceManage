package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.FinanceProduct;
import com.company.project.service.FinanceProductService;
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
@RequestMapping("/finance/product")
public class FinanceProductController {
    @Resource
    private FinanceProductService financeProductService;

    @PostMapping("/add")
    public Result add(FinanceProduct financeProduct) {
        financeProductService.save(financeProduct);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody String id) {
        financeProductService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(FinanceProduct financeProduct) {
        financeProductService.update(financeProduct);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam String id) {
        FinanceProduct financeProduct = financeProductService.findById(id);
        return ResultGenerator.genSuccessResult(financeProduct);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<FinanceProduct> list = financeProductService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
