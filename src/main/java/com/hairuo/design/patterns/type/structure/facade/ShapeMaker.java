package com.hairuo.design.patterns.type.structure.facade;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.structure.facade
 * @Date: create in 2022-11-03
 */
public class ShapeMaker {
    private Rectangle rectangle;
    private Circle circle;



    public ShapeMaker() {
        this.rectangle = new Rectangle();
        this.circle = new Circle();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }


}
