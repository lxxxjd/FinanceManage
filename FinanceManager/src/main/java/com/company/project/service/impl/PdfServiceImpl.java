package com.company.project.service.impl;

import com.company.project.service.PdfService;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PdfServiceImpl implements PdfService {
    @Override
    public boolean checkPathIsExisting(String Path) {
        Resource resource = new ClassPathResource(Path);
        if(resource.exists()){
            return true;
        }else{
            return false;
        }
    }
}
