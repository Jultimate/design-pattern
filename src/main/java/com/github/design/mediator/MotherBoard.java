package com.github.design.mediator;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/07 15:28
 * @Email: chongzhao66@gmail.com
 */
public class MotherBoard implements Mediator {

    private Components transmit;

    private Components receive;

    @Override
    public void exchange(String data, String from, String to) {
        switch (from) {
            case "KEYBOARD":
                transmit = new KeyBoard(from);
                break;
            case "GRAPHIC_CARD":
                transmit = new GraphicCard(from);
                break;
        }

        switch (to) {
            case "MONITOR":
                receive = new Monitor(to);
                break;
            case "GRAPHIC_CARD":
                transmit = new GraphicCard(to);
                break;
        }

        transmit.sendData(data, to,receive);

        receive.getData(from);

    }

    public static void main(String[] args) {
        Mediator mediator = new MotherBoard();
        mediator.exchange("vertical move", "KEYBOARD", "MONITOR");

    }
}
