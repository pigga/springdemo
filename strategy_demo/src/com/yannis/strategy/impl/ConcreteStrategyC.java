package com.yannis.strategy.impl;

import com.yannis.strategy.Strategy;

/// <summary>
/// 具体策略类C
/// </summary>
public class ConcreteStrategyC implements Strategy {

    @Override
    public void strategyFunc() {
        System.out.println("Strategy C has worked!");
    }
}
