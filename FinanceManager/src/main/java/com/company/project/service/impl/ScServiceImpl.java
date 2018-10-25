package com.company.project.service.impl;

import com.company.project.dao.ScMapper;
import com.company.project.model.Sc;
import com.company.project.model.StudentCourseSC;
import com.company.project.service.ScService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2018/10/25.
 */
@Service
@Transactional
public class ScServiceImpl extends AbstractService<Sc> implements ScService {
    @Resource
    private ScMapper scMapper;

    @Override
    public List<StudentCourseSC> selectAllSC() {
        return scMapper.selectAllSC();
    }
}
