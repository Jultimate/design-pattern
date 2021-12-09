package com.github.design.abstraction;

import com.github.design.abstraction.game.ARPG;
import com.github.design.abstraction.game.CallOfDuty;
import com.github.design.abstraction.game.FPS;
import com.github.design.abstraction.game.TheElderScrolls;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/06 19:07
 * @Email: chongzhao66@gmail.com
 */
public class OlderGameFactory extends AbstractGameFactory {

    @Override
    protected FPS getFPS() {
        return new CallOfDuty();
    }

    @Override
    protected ARPG getARPG() {
        return new TheElderScrolls();
    }
}
