package com.hairuo.design.patterns.type.create.biuilder;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.create.biuilder
 * @Date: create in 2022-07-31
 */
public class Director {
    public Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Builder construct(Long priceCpu, Long priceGpu, Long priceMem){
        builder.setCpu(priceCpu);
        builder.setGpu(priceGpu);
        builder.setMem(priceMem);
        return builder;
    }

}
