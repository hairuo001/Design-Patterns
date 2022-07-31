package com.hairuo.design.patterns.type.create.biuilder;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.create.biuilder
 * @Date: create in 2022-07-31
 */
public interface Builder {
    public void setCpu(long price);
    public void setGpu(long price);
    public void setMem(long price);

}
