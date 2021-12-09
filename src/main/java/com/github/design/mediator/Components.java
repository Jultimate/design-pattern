package com.github.design.mediator;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/07 15:30
 * @Email: chongzhao66@gmail.com
 */
public abstract class Components {

    private final String name;

    private String data;

    public Components(String name){
        this.name = name;
    }

    public void sendData(String data, String to,Components receive) {
        receive.data = data;
        System.out.println(name + " send data to " + to);
    }

    public void getData(String from) {
        System.out.println(name + " receive data from" + from + " , data is [ " + data + " ] ");
    }


}
