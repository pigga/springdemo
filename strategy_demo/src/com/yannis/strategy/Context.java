package com.yannis.strategy;

/// <summary>
/// 环境
/// </summary>
public class Context {

    //持有一个具体策略的对象
    private Strategy strategy;

    /// <summary>
    /// 构造函数，传入一个具体策略对象
    /// </summary>
    /// <param name="strategy"></param>
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    /// <summary>
    /// 调用策略方法
    /// </summary>
    public void contextFunc() {
        strategy.strategyFunc();
    }
}
