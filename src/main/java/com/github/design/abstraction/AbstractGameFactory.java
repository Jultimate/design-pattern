package com.github.design.abstraction;

import com.github.design.abstraction.game.ARPG;
import com.github.design.abstraction.game.FPS;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/06 18:51
 * @Email: chongzhao66@gmail.com
 */
public abstract class AbstractGameFactory {

    protected abstract FPS getFPS();

    protected abstract ARPG getARPG();

    public static void main(String[] args){
        AbstractGameFactory olderGameFactory = new OlderGameFactory();
        FPS olderFps = olderGameFactory.getFPS();
        olderFps.play();
        ARPG olderARPG = olderGameFactory.getARPG();
        olderARPG.play();

        AbstractGameFactory nextGameFactory = new NextGenerationGameFactory();
        FPS nextFps = nextGameFactory.getFPS();
        nextFps.play();
        ARPG nextArpg = nextGameFactory.getARPG();
        nextArpg.play();

    }
}
