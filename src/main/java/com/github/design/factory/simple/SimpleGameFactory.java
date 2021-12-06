package com.github.design.factory.simple;

import com.github.design.factory.game.Contra;
import com.github.design.factory.game.Game;
import com.github.design.factory.game.Mario;
import com.github.design.factory.game.RedAlert3;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/06 14:14
 * @Email: chongzhao66@gmail.com
 */
public class SimpleGameFactory {

    public static Game getGame(String name){
        return switch (name) {
            case "RedAlert3" -> new RedAlert3();
            case "Mario" -> new Mario();
            case "Contra" -> new Contra();
            default -> throw new RuntimeException("No Game named [ " + name + " ].");
        };
    }

    public static void main(String[] args){
        Game mario = SimpleGameFactory.getGame("Mario");
        mario.play();
        Game redAlert3 = SimpleGameFactory.getGame("RedAlert3");
        redAlert3.play();
        Game contra = SimpleGameFactory.getGame("Contra");
        contra.play();
        Game rr = SimpleGameFactory.getGame("rr");

    }
}
