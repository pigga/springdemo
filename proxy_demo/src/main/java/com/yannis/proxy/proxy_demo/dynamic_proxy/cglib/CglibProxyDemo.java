package com.yannis.proxy.proxy_demo.dynamic_proxy.cglib;

import com.yannis.proxy.proxy_demo.static_proxy.UserDao;

public class CglibProxyDemo {

    public static void main(String[] args) {
        //目标对象
        UserDao target = new UserDao();

        //代理对象
        UserDao proxy = (UserDao)new ProxyFactory(target).getProxyInstance();

        //执行代理对象的方法
        proxy.save();
    }
}
