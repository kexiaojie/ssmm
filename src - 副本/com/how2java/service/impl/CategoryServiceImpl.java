package com.how2java.service.impl;

import java.util.List;

import com.how2java.service.CategoryService;
import com.how2java.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.CategoryMapper;
import com.how2java.pojo.Category;

@Service
public class CategoryServiceImpl  implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    public List<Category> list(){
        return categoryMapper.list();
    }

    @Override
    public int total() {
        return categoryMapper.total();
    }

    @Override
    public List<Category> list(Page page) {
        return categoryMapper.list(page);
    }

}