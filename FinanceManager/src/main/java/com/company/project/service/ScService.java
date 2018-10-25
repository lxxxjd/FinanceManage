package com.company.project.service;
import com.company.project.model.Sc;
import com.company.project.core.Service;
import com.company.project.model.StudentCourseSC;

import java.util.List;


/**
 * Created by CodeGenerator on 2018/10/25.
 */
public interface ScService extends Service<Sc> {
    public List<StudentCourseSC> selectAllSC();
}
