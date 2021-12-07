package com.github.design.abstraction;

import com.github.design.abstraction.AbstractGameFactory;
import com.github.design.abstraction.game.ARPG;
import com.github.design.abstraction.game.Battlefield1;
import com.github.design.abstraction.game.FPS;
import com.github.design.abstraction.game.TheWildHunt;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/06 19:09
 * @Email: chongzhao66@gmail.com
 */
public class NextGenerationGameFactory extends AbstractGameFactory {
    @Override
    protected FPS getFPS() {
        return new Battlefield1();
    }

    @Override
    protected ARPG getARPG() {
        return new TheWildHunt();
    }
}
