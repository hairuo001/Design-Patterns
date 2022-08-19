package com.hairuo.design.patterns.type.create.prototype;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.create.prototype
 * @Date: create in 2022-08-19
 */
public abstract class Shape implements Cloneable {
    String type;
    String id;

    abstract void draw();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
