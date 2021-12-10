package com.github.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/10 23:39
 * @Email: chongzhao66@gmail.com
 */
public abstract class Category {

    String name;

    public Category(String name){
        this.name = name;
    }

    List<Category> categorys = new ArrayList<>();

    public void add(Category category){
        categorys.add(category);
    }
}
