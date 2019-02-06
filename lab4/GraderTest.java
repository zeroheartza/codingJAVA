import java.util.*;
public class GraderTest{
    public static void main(String[] args) {
        Scanner Str = new Scanner(System.in);
        Scanner Int = new Scanner(System.in);
        System.out.print("Enter course name : ");
        String name = Str.nextLine();
        System.out.print("Enter number of Students : ");
        int num = Int.nextInt();
        Grader n1 = new Grader(name);

        System.out.println("\nInput scores");
        for(int i=0;i<num;i++){
            Double n = Int.nextDouble();
            n1.addScores(n);
        }
        System.out.printf("Mean for %s = %.2f \n",n1.getCourseName(),n1.mean());
        System.out.printf("Below mean = %d \n",n1.belowMean());
        System.out.printf("Above mean = %d \n",n1.aboveGrade());
        n1.showGrade();
        System.out.println("#####################\n");

        System.out.print("Enter course name : ");
        name = Str.nextLine();
        System.out.print("Enter number of Students : ");
        num = Int.nextInt();
        Grader n2 = new Grader(name);

        System.out.println("\nInput scores");
        for(int i=0;i<num;i++){
            Double n = Int.nextDouble();
            n2.addScores(n);
        }
        System.out.printf("Mean for %s = %.2f \n",n2.getCourseName(),n2.mean());
        System.out.printf("Below mean = %d \n",n2.belowMean());
        System.out.printf("Above mean = %d \n",n2.aboveGrade());
        n2.showGrade();
        System.out.println("#####################\n");
       
        
      
        
    }
}
