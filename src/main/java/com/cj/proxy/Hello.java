package com.cj.proxy;

/**
 * 被代理类1
 */
public class Hello implements HelloInterface{

    public void sayHello(){
        System.out.println("Hello Guys");
    }
}
