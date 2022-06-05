package com.jvm.chapter4_vmstack.java4_8;

/**
 * 虚方法表的举例
 */
interface Friendly {
    void sayHello();

    void sayGoodbye();
}

class Dog2 {
    public void sayHello() {
    }

    public String toString() {
        return "Dog";
    }
}

class Cat2 implements Friendly {
    public void eat() {
    }

    public void sayHello() {
    }

    public void sayGoodbye() {
    }

    protected void finalize() {
    }

    public String toString() {
        return "Cat";
    }
}

class CockerSpaniel extends Dog2 implements Friendly {
    public void sayHello() {
        super.sayHello();
    }

    public void sayGoodbye() {
    }
}

public class VirtualMethodTable {
}
