package com.github.design.composite;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/10 23:45
 * @Email: chongzhao66@gmail.com
 */
public class CategoryTree
{
    public static void tree(Category category, int depth)
    {
        for(int i = 0;i < depth;i++)
        {
            System.out.print("== ");
        }

        System.out.println(category.name);

        for(Category childCategory : category.categorys)
        {
            tree(childCategory, depth + 1);
        }
    }
}
