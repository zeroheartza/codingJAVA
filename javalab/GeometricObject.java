import java.util.*;

public class GeometricObject{
    private String color;
    private boolean filled;
    public GeometricObject(){
        this.color="white";
        this.filled=false;
    }
    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public void setFilled(boolean filled){
        this.filled=filled;
    }

    public String toString() {
        return "Color: "+color + ",isFilled: "+ filled;
    }

}
