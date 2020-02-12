package com.cj.proxy;

import java.lang.reflect.Proxy;

/**
 * 执行动态代理
 */
public class ProxyMain {
    public static void main(String[] args) {
        Hello hello = new Hello();
        Bye bye = new Bye();


        ProxyHandler handler = new ProxyHandler(hello);
        ProxyHandler handler1 = new ProxyHandler(bye);

        //TODO 获取代理类对象
        HelloInterface helloInterface = (HelloInterface) Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(), handler);
        ByeInterface byeInterface = (ByeInterface) Proxy.newProxyInstance(Bye.class.getClassLoader(), Bye.class.getInterfaces(), handler1);

        //TODO 通过代理类对象调用被代理类的方法
        helloInterface.sayHello();
        byeInterface.sayBye();

    }
}
