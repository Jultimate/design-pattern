package com.github.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/10 23:44
 * @Email: chongzhao66@gmail.com
 */
public class CategoryRoot extends Category {
    public CategoryRoot() {
        super("ROOT");
    }

    final List<Category1> category1s = new ArrayList<>();

    public void add(Category1 category1) {
        category1s.add(category1);
    }

}
