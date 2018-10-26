package com.company.project.service.impl;

import com.company.project.dao.KnowledgeMapper;
import com.company.project.model.Knowledge;
import com.company.project.service.KnowledgeService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/10/26.
 */
@Service
@Transactional
public class KnowledgeServiceImpl extends AbstractService<Knowledge> implements KnowledgeService {
    @Resource
    private KnowledgeMapper knowledgeMapper;

}
