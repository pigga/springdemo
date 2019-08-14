package com.yannis.strategy.impl;

import com.yannis.strategy.Strategy;

/// <summary>
/// 具体策略类B
/// </summary>
public class ConcreteStrategyB implements Strategy {

    @Override
    public void strategyFunc() {
        System.out.println("Strategy B has worked!");
    }
}
