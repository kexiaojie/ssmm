package com.how2java.service;

import com.how2java.pojo.Category;
import com.how2java.util.Page;

import java.util.List;

public interface CategoryService {
    public List<Category> list(Page page);
    public  int total();
    public Category edit(int id);
    public void update(Category category);
}