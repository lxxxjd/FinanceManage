package com.company.project.model;

import javax.persistence.*;

public class Knowledge {
    /**
     * 编号
     */
    @Id
    private String kid;

    /**
     * 知识类型
     */
    @Column(name = "knowledge_type")
    private String knowledgeType;

    /**
     * 问题
     */
    private String question;

    /**
     * 回答
     */
    private String answer;

    /**
     * 获取编号
     *
     * @return kid - 编号
     */
    public String getKid() {
        return kid;
    }

    /**
     * 设置编号
     *
     * @param kid 编号
     */
    public void setKid(String kid) {
        this.kid = kid;
    }

    /**
     * 获取知识类型
     *
     * @return knowledge_type - 知识类型
     */
    public String getKnowledgeType() {
        return knowledgeType;
    }

    /**
     * 设置知识类型
     *
     * @param knowledgeType 知识类型
     */
    public void setKnowledgeType(String knowledgeType) {
        this.knowledgeType = knowledgeType;
    }

    /**
     * 获取问题
     *
     * @return question - 问题
     */
    public String getQuestion() {
        return question;
    }

    /**
     * 设置问题
     *
     * @param question 问题
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * 获取回答
     *
     * @return answer - 回答
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * 设置回答
     *
     * @param answer 回答
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }
}