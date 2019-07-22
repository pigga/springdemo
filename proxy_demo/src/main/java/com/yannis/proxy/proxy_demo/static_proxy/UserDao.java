package com.yannis.proxy.proxy_demo.static_proxy;

public class UserDao implements IUserDao {

    @Override
    public void save() {
        System.out.println("----begin save---");
    }
}
