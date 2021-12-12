package com.github.design.dynamic_proxy.mapper;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/12 11:17
 * @Email: chongzhao66@gmail.com
 */
public class MapperTest
{
    public static void main(String[] args)
    {
        CrudService service = new CrudService();
        User user = service.queryById(10L);
        System.out.println(user.name);
    }
}
