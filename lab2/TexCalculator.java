
import java.util.*;


public class TexCalculator{
    public static int cal_1(int Tex) {
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

    public static int Step(int Tex) {
        if(Tex==7){
            return 35;
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
    public static int cal_2(int sum){

        int n =Step(cal_1(sum));
        
        System.out.print(sum);
        
        switch (n) {
            case 7:
                System.out.print(" - 3000000");
                sum-=3000000;
                System.out.print(" = "+sum+" ");
  
            case 6:
                System.out.print(" - 1000000");
                sum-=1000000;
                System.out.print(" = "+sum+" ");

            case 5:
                System.out.print("  250000 ");
                sum-=250000;
                System.out.print(" = "+sum+" ");
                
            case 4:
                System.out.print(" - 250000 ");
                sum-=250000;
                System.out.print(" = "+sum+" ");
       
            case 3:
                System.out.print(" - 200000 ");
                sum-=200000;
                System.out.print(" = "+sum+" ");

            case 2:
                System.out.print(" - 150000 ");
                sum-=150000;
                System.out.print(" = "+sum+" ");

            case 1:
                System.out.print(" - 150000 ");
                sum-=150000;
                System.out.print(" = "+sum+" ");   
        }
        return sum;
    }

    public static int cal_3(int Tex){
        if(Tex==35){
            return 7;
        }
        if(Tex==6){
            return 30;
        }
        if(Tex==5){
            return 25;
        }
        if(Tex==4){
            return 20;
        }
        if(Tex==3){
            return 15;
        }
        if(Tex==2){
            return 10;
        }
        if(Tex==1){
            return 5;
        }
        else{
            return 0;
        }
        
    }

    
    

    public static void main(String[] args){
        
        int income;
        Scanner inStr = new Scanner(System.in);
        Scanner inInt = new Scanner(System.in);
        System.out.print("Enter Salary : ");
        int Salary=inInt.nextInt();
        System.out.print("Enter Year cost : ");
        int YearC=inInt.nextInt();
        System.out.print("Enter Tax deduction : ");
        int TaxD=inInt.nextInt();
        System.out.print("\nYou have other income? ");
        String choose=inStr.nextLine();
        
        if(choose.equals("Y")){
            System.out.print("Input other income : ");
            int Oincome=inInt.nextInt();
            income = (Salary*12)-YearC - TaxD + Oincome;
            System.out.println("\nIncome : "+"("+Salary+"x"+"12)"+" - "+YearC +" - "+ TaxD +" + "+Oincome+" = "+income);
            System.out.println("Tax is "+cal_1(income)+"%\n");
        }
        else{
            income = (Salary*12)-YearC - TaxD ;
            System.out.println("\nIncome : "+"("+Salary+"x"+"12)"+" - "+YearC +" - "+ TaxD +" = "+income);
            System.out.println("Tax is "+cal_1(income)+"%\n");

        }
        if(cal_1(income)!=0){
            int sum=0;
            int[] List = {150000, 150000, 200000, 250000,250000,1000000,3000000};
            int n =Step(cal_1(income));
            if(n==1){
                System.out.print("Cal Tax ");
                int x= cal_2(income);
                System.out.print(" * "+cal_1(income)+"%"+" = ");
                System.out.println(x*cal_1(income)/100);
                sum+=x*cal_1(income)/100;
            }
            else{
                System.out.println("step "+n);
                System.out.print("Cal Tax ");
                int x= cal_2(income);
                System.out.print(" * "+cal_1(income)+"%"+" = ");
                System.out.println(x*cal_1(income)/100);
                sum+=x*cal_1(income)/100;
                
                for(int i=n-1;i>0;i--){
                    System.out.println("step "+i);
                    System.out.println("Cal Tax "+List[i]+" * "+cal_3(i)+"% = "+(List[i]*cal_3(i))/100);
                    sum+=(List[i]*cal_3(i))/100;
                }
            }
            System.out.println("Your Tax = "+sum+" BTH");
        }
    else{
        System.out.println("Your Tax = Free Tax");
        }
    }
}