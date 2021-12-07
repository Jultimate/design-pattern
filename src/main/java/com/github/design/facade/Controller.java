package com.github.design.facade;

/**
 * @Description: Controller is a facade class
 * @Author: CHONG
 * @CreateTime: 2021/12/07 15:15
 * @Email: chongzhao66@gmail.com
 */

// @Facade
public class Controller {

    private final Service service = new Service();

    public void add(){
        service.doAdd();
    }

    public void del(){
        service.doDel();
    }

    public void update(){
        service.doUpdate();
    }

    public void query(){
        service.doQuery();
    }
}
