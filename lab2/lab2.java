import java.util.*;
public class lab2{
    
    public static int menu(){
        Scanner Input = new Scanner(System.in);
        System.out.println("what options you have");
        System.out.println("Welcome to calculator.java");
        System.out.println("your options are:\n");
        System.out.println("1) Addition");
        System.out.println("2) Subtraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");
        System.out.println("5) Quit calcutor.java\n");
        System.out.print("Choose your option: ");
        int Choose = Input.nextInt();
        return Choose;
    }

    public static void add(int a,int b){
        System.out.println(a+" + "+b+" = "+(a+b)+"\n");
    }

    public static void sub(int a,int b){
        System.out.println(a+" - "+b+" = "+(a-b)+"\n");
    }
    public static void Multiplies(int a,int b){
        System.out.println(a+" * "+b+" = "+(a*b)+"\n");
    }
    public static void divides(int a,int b){
        System.out.println(a+" / "+b+" = "+(a/b)+"\n");
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int a,b;
        int Choose;
        while(true){
            Choose=menu();
            switch (Choose){
                case 1:
                    System.out.print("Add this: ");
                    a=Input.nextInt();
                    System.out.print("to this: ");
                    b=Input.nextInt();
                    add(a,b);
                    break;
                case 2:
                    System.out.print("Add this: ");
                    a=Input.nextInt();
                    System.out.print("to this: ");
                    b=Input.nextInt();
                    sub(a,b);
                    break;
                case 3:
                    System.out.print("Add this: ");
                    a=Input.nextInt();
                    System.out.print("to this: ");
                    b=Input.nextInt();
                    Multiplies(a,b);
                    break;
                case 4:
                    System.out.print("Add this: ");
                    a=Input.nextInt();
                    System.out.print("to this: ");
                    b=Input.nextInt();
                    divides(a,b);
                    break;
                default: break;
            }
        
        }
    }

}