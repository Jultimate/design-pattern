package com.github.design.strategy;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/06 12:34
 * @Email: chongzhao66@gmail.com
 */
public class Player {

    String name = "master";

    String group;

    public Player(){}

    public Player(String group){
        this.group = group;
    }

    public static void main(String[] args){
        StartGame.start(new Player("旭日"));
        StartGame.start(new Player("苏联"));
        StartGame.start(new Player("盟军"));
    }
}
