import java.util.*;
public class Rectangle extends GeometricObject{
    private double width;
    private double height;
    public Rectangle(){
        this.width=0.0;
        this.height=0.0;

    }
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }

    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width){
        this.width=width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height=height;
    }

    public double getArea(){
        return width*height;
    }

    public String toString() {
        super.toString();
        return super.toString()+ ",width: "+ width + ",height: " + height;
    }
}