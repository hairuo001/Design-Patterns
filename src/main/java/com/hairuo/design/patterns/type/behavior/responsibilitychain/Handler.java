package com.hairuo.design.patterns.type.behavior.responsibilitychain;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.responsibilitychain
 * @Date: create in 2022-07-24
 */
public abstract class Handler {
    protected Handler next;
    protected int type;
    protected int type1 = 1;
    protected int type2 = 2;
    protected int type3 = 3;

    public void setNext(Handler next) {
        this.next = next;
    }

    public void handler(int type){
        if(this.type == type){
            System.out.println("handle data of this type");
        }else {
            next.handler(type);
        }


    }

}
