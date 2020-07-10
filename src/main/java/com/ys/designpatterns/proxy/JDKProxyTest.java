package com.ys.designpatterns.proxy;

/**
 * Create by YSOcean
 */
public class JDKProxyTest {

    public static void main(String[] args) throws Exception {
        Person instance = (Person) new JDKMeiPoProxy().getInstance(new Customer());
        instance.findLove();
    }
}
