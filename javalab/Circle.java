import java.util.*;
public class Circle extends GeometricObject{
    private double radius;
    public  Circle(){
        this.radius=0.0;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public String toString() {
        
        return super.toString() +",radius:"+radius;
    }
        
}