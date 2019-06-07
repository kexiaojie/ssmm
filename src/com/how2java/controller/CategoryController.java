package com.how2java.controller;

import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;
import com.how2java.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping("listCategory")
    public ModelAndView list(Page page){
        List<Category> cs = categoryService.list(page);
        ModelAndView modelAndView = new ModelAndView("listCategory");
        int total = categoryService.total();
        page.caculateLast(total);
        modelAndView.addObject("cs",cs);
        return modelAndView;
    }
    @RequestMapping("editCategory")
    public Category edit(int id){
        Category category = categoryService.edit(id);
        return category;
    }
    @RequestMapping("updateCategory")
    public ModelAndView editdo(Category category){
        ModelAndView modelAndView = new ModelAndView("listCategory");
        categoryService.update(category.getId());
        return modelAndView;
    }
}