package com.yannis.proxy.proxy_demo.static_proxy;

public class UserProxyDemo {

    public static void main(String[] args) {
        //目标对象
        UserDao target = new UserDao();
        IUserDao proxy = new UserProxyDao(target);
        proxy.save();
    }
}
