package com.hairuo.design.patterns.type.create.biuilder;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.create.biuilder
 * @Date: create in 2022-07-31
 */
public class DesktopBuilder implements Builder{
    public ModuleCpu cpu = new ModuleCpu(0);
    public ModuleGpu gpu = new ModuleGpu(0);
    public ModuleMemory mem = new ModuleMemory(0);

    @Override
    public String toString() {
        return "DesktopBuilder{" +
                "cpu=" + cpu.price +
                ", gpu=" + gpu.price +
                ", mem=" + mem.price +
                '}';
    }

    @Override
    public void setCpu(long price) {
        cpu = new ModuleCpu(price);
    }

    @Override
    public void setGpu(long price) {
        gpu = new ModuleGpu(price);
    }

    @Override
    public void setMem(long price) {
        mem = new ModuleMemory( price);

    }
}
