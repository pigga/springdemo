package com.yannis.strategy;

import com.yannis.strategy.impl.ConcreteStrategyA;

public class Demo1 {

    //问题： 对于不同的策略需传入不同的实现

    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategyA();
        Context context = new Context(strategy);
        context.contextFunc();
    }
}
