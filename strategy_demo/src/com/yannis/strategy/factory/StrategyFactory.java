package com.yannis.strategy.factory;

import com.yannis.strategy.Strategy;
import com.yannis.strategy.impl.ConcreteStrategyA;
import com.yannis.strategy.impl.ConcreteStrategyB;
import com.yannis.strategy.impl.ConcreteStrategyC;

import java.util.HashMap;
import java.util.Map;

public class StrategyFactory {

    private static StrategyFactory factory = new StrategyFactory();
    private StrategyFactory(){
    }
    private static Map<String, Strategy> strategyMap = new HashMap<>();
    static{
        strategyMap.put(StrategyTypeEnum.StrategyA.getId(), new ConcreteStrategyA());
        strategyMap.put(StrategyTypeEnum.StrategyB.getId(), new ConcreteStrategyB());
        strategyMap.put(StrategyTypeEnum.StrategyC.getId(), new ConcreteStrategyC());
    }

    public static Strategy getStrategyById(String typeId){
        return strategyMap.get(typeId);
    }

    public static StrategyFactory getInstance(){
        return factory;
    }
}
