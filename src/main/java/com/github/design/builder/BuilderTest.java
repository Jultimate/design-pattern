package com.github.design.builder;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/13 22:27
 * @Email: chongzhao66@gmail.com
 */
public class BuilderTest
{
    public static void main(String[] args)
    {
        AircraftCarrier builder = Builder.classes("Kuznetsov").aircraft("J-15").propulsion("150MW")
                .displacement("67500t").power("Steam turbines").builder();
        System.out.println(builder.displacement);
    }
}
