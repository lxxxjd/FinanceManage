package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.Sc;
import com.company.project.model.StudentCourseSC;

import java.util.List;

public interface ScMapper extends Mapper<Sc> {
    public List<StudentCourseSC> selectAllSC();
}