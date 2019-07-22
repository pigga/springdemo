package com.yannis.proxy.proxy_demo.static_proxy;

public class UserProxyDao implements IUserDao {
    private UserDao userDao;

    public UserProxyDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("----事物开始---");
        userDao.save();
        System.out.println("----事物结束---");
    }
}
