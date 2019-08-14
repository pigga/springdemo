package com.yannis.strategy.factory;

public enum StrategyTypeEnum {
    StrategyA("A", "策略A"), StrategyB("B", "策略B"), StrategyC("C", "策略C");

    private String id;
    private String desc;

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    StrategyTypeEnum(String id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    public static StrategyTypeEnum getById(String typeId){
        for(StrategyTypeEnum typeEnum : StrategyTypeEnum.values()){
            if(typeEnum.id.equals(typeId)){
                return typeEnum;
            }
        }
        return null;
    }
}
