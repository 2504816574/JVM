package com.jvm.chapter4_vmstack;

/**
 * 动态链接
 * @author sdong
 * @date 2022/5/29
 */
public class DynamicLinking {

    int num =10;
    public void methodA(){
        System.out.println("methodA........");

    }
    public void methodB(){
        System.out.println("methodB........");
        methodA();
        num++;

    }

    public static void main(String[] args) {
        DynamicLinking dynamicLinking = new DynamicLinking();
        dynamicLinking.methodB();
    }
}
