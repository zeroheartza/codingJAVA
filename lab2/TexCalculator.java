import java.util.*;


;public class TexCalculator{
    public static int calulator(int Tex) {
        if(Tex>5000000){
            return 35;
        }
        if(Tex>2000000){
            return 30;
        }
        if(Tex>1000000){
            return 25;
        }
        if(Tex>750000){
            return 20;
        }
        if(Tex>500000){
            return 15;
        }
        if(Tex>300000){
            return 10;
        }
        if(Tex>150000){
            return 5;
        }
        else{
            return 0;
        }
        
    }
    public static int cal_tex(int Tex) {
        if(Tex>5000000){
            return Tex-5000000;
        }
        if(Tex>2000000){
            return Tex-2000000;
        }
        if(Tex>1000000){
            return Tex-1000000;
        }
        if(Tex>750000){
            return Tex-750000;
        }
        if(Tex>500000){
            return Tex-500000;
        }
        if(Tex>300000){
            return Tex-300000;
        }
        if(Tex>150000){
            return Tex-150000;
        }
        else{
            return 0;
        }
        
    }

    public static int Step(int Tex) {
        if(Tex==35){
            return 7;
        }
        if(Tex==30){
            return 6;
        }
        if(Tex==25){
            return 5;
        }
        if(Tex==20){
            return 4;
        }
        if(Tex==15){
            return 3;
        }
        if(Tex==10){
            return 2;
        }
        if(Tex==5){
            return 1;
        }
        else{
            return 0;
        }
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("t");
        int Salary;
        int Yc;
        int Td;
        int Oi;
        int Income;
        int Tex;
        int sTex;
        String choose;
        int S;
        int x;
        System.out.print("Enter Salary : ");
        Salary=input.nextInt();
        System.out.print("Enter Year cost : ");
        Yc=input.nextInt();
        System.out.print("Enter Tax deduction : ");
        Td=input.nextInt();
        System.out.print("\nYou have other income? ");
        choose=input.nextLine();
        choose=input.nextLine();
        if(choose.equals("Y")){
            System.out.print("Input other income : ");
            Oi=input.nextInt();
            Income = (Salary*12)-Yc - Td + Oi;
            System.out.println("Income : "+"("+Salary+"x"+"12)"+" - "+Yc +" - "+ Td +" + "+Oi+" = "+Income);
            Tex = calulator(Income);
            System.out.print("Tex is "+Tex+"%");
            S=Step(Tex);
            Tex=Income;
            for(int i=0;i<S;i++){
                System.out.println(Tex);
                System.out.println("Step "+(S-i));
                x=calulator(Tex);
                Tex = cal_tex(Tex);
                System.out.println(Tex+" x "+x+" = "+((Tex*x)/100));
            }
            

        }
        else{
           
            Income = (Salary*12)-Yc - Td;
            System.out.println("Income : "+"("+Salary+"x"+"12)"+" - "+Yc +" - "+ Td +" = "+Income);
            Tex = calulator(Income);
            x=calulator(Tex);
            System.out.print("Tex is "+Tex+"%");
            S=Step(Tex);
            System.out.println("Step "+S);
            Tex = cal_tex(Income);
        }
        
    }
}
