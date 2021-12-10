package com.github.design.composite;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/10 23:56
 * @Email: chongzhao66@gmail.com
 */
public class TreeTest {
    public static void main(String[] args) {
        Category category = new CategoryRoot();
        Category1 category1 = new Category1("Book");
        category.add(category1);

        Category2 category21 = new Category2("PROGRAM");
        Category2 category22 = new Category2("NOVEL");
        category1.add(category21);
        category1.add(category22);

        Category3 category31 = new Category3("OpreatingSystems");
        Category3 category32 = new Category3("C_Primer_PLUS");
        category21.add(category31);
        category21.add(category32);

        Category3 category33 = new Category3("JaneErye");
        Category3 category34 = new Category3("Ulysses");
        category22.add(category33);
        category22.add(category34);

        CategoryTree.tree(category, 0);
    }
}
