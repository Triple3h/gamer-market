package com.qf.gamer.domain.entity;

import lombok.Data;

@Data
public class Category {
    /**
    * 一级分类
    */
    private Integer categoryId;

    /**
    * 分类名称
    */
    private String categoryName;
}