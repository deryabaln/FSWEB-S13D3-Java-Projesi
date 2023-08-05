package com.workintech.model;

public class Wall {
    double width;
    double height;

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
       checkWidth(width);
    }

    public void setHeight(double height) {
       checkHeight(height);
    }

    public void  checkWidth(double width){
        if(width<0){
            this.width= 0;
        }else {
            this.width = width;
        }
    }

    public void  checkHeight(double height){
        if(height<0){
            this.height= 0;
        }else {
            this.height = height;
        }
    }

    public double getArea(){
        return this.height * this.width;
    }
}
