package com.yannis.strategy;

import com.yannis.strategy.factory.StrategyFactory;
import com.yannis.strategy.factory.StrategyTypeEnum;

public class Demo2 {
    public static void main(String[] args) {
        Strategy strategy = StrategyFactory.getStrategyById(StrategyTypeEnum.StrategyB.getId());
        Context context = new Context(strategy);
        context.contextFunc();
    }
}
