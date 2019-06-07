package com.how2java.mapper;

import com.how2java.pojo.Category;
import com.how2java.util.Page;

import java.util.List;

public interface CategoryMapper {
//鞥局条件查询获取结果集
    public List<Category> list(Page page);
    public  int total();
    public Category edit(int id);
    public void update(Category category);
}