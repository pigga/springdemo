package com.yannis.proxy.proxy_demo.dynamic_proxy.jdk;


import com.yannis.proxy.proxy_demo.static_proxy.IUserDao;
import com.yannis.proxy.proxy_demo.static_proxy.UserDao;

public class JdkProxyDemo {

    public static void main(String[] args) {
        IUserDao target = new UserDao();
        IUserDao jdk_dynamic_proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        System.out.println("==========" + jdk_dynamic_proxy.getClass());
        jdk_dynamic_proxy.save();
    }
}
