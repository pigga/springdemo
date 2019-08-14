package com.yannis.strategy.impl;

import com.yannis.strategy.Strategy;

/// <summary>
/// 具体策略类A
/// </summary>
public class ConcreteStrategyA implements Strategy {

    @Override
    public void strategyFunc() {
        System.out.println("Strategy A has worked!");
    }
}
