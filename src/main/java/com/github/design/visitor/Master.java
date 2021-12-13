package com.github.design.visitor;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/13 18:54
 * @Email: chongzhao66@gmail.com
 */
public abstract class Master {
    String snapShot;

    String name;

    public Master(String name, String snapShot) {
        this.name = name;
        this.snapShot = snapShot;
    }

    protected void send(Slave slave) {
        slave.receive(this);
    }
}

class MasterOne extends Master {
    public MasterOne(String snapShot) {
        super("MASTER_ONE", snapShot);
    }
}

class MasterTwo extends Master {
    public MasterTwo(String snapShot) {
        super("MASTER_TWO", snapShot);
    }
}

class MasterThree extends Master {
    public MasterThree(String snapShot) {
        super("MASTER_THREE", snapShot);
    }
}
