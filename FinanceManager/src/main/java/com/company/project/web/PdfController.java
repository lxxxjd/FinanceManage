package com.company.project.web;

import com.alibaba.fastjson.JSONObject;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.service.UserService;
import com.company.project.service.impl.PdfServiceImpl;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resources;
import java.io.File;

@RestController
@RequestMapping("/resources")
public class PdfController {
    //用service无法执行相关代码
    //private PdfServiceImpl pdfService;
    @GetMapping(value = "/viewPdf", produces = "application/pdf")
    @ResponseBody
    public FileSystemResource viewPdf(@RequestParam(name="path") String path) {
        try {
            //System.out.println(path);
                Resource resource = new ClassPathResource(path);//获取资源文件
                if(resource.exists()){//判断文件是否存在
                //System.out.println("True");
                    File file = resource.getFile();
                    return new FileSystemResource(file);

                }else{
                    System.out.println("False");
                }

                return  null;
        }catch (Exception e){
            //return new FileSystemResource();
            return  null;
        }
    }
}
