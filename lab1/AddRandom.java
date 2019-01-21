import java.util.Random;

public class AddRandom{
  public static void main(String[] args){


    Random rand = new Random();
    double a = rand.nextDouble()*50;
    double b = rand.nextDouble()*50;
    double c = a+b;
    System.out.println("Sum of "+a+" + "+b+" = "+c+"\n");
    if(c>=50){
      System.out.println("Value = PASS");
    }
    else{
      System.out.println("Value = NOTPASS");
    }
  }
}
