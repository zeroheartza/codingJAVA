import java.util.*;
public class Grader{
    private String courseName;
    private ArrayList<Double> scores=new ArrayList<Double>();
    

    public Grader(String name){
        this.courseName=name;
        
    }
    public  void addScores(double score){
       
        this.scores.add(score);
    }
    public int countStudents(){
        return this.scores.size();
    }
    public double mean() {
        double Sum=0;
        for(int i=0;i<this.scores.size();i++){
            Sum+=this.scores.get(i);
        }
        return Sum/this.scores.size();
    }
    public int belowMean() {
        int Sum=0;
        for(int i=0;i<this.scores.size();i++){
            if(this.scores.get(i)<=mean()){
                Sum+=1;
            }
            
        }
        return Sum;
        
    }
    public int aboveGrade() {
        int Sum=0;
        for(int i=0;i<this.scores.size();i++){
            if(this.scores.get(i)>=mean()){
                Sum+=1;
            }
            
        }
        return Sum;
        
    }
    public void showGrade() {
        int A=0,BB=0,B=0,CC=0,C=0,DD=0,D=0,F=0;

        for(int i=0;i<this.scores.size();i++){
            if(this.scores.get(i)>=80){
                A+=1;
            }

            else if(this.scores.get(i)>=75){
                BB+=1;
            }

            else if(this.scores.get(i)>=70){
                B+=1;
            }

            else if(this.scores.get(i)>=65){
                CC+=1;
            }

            else if(this.scores.get(i)>=60){
                C+=1;
            }

            else if(this.scores.get(i)>=55){
                DD+=1;
            }

            else if(this.scores.get(i)>=50){
                D+=1;
            }

            else if(this.scores.get(i)<50){
                F+=1;
            }
            
        }

        System.out.printf("Grader : A %d, B+ %d, B %d, C+ %d, C %d, D+ %d, D %d, F %d \n",A,BB,B,CC,C,DD,D,F);
    }
    public String getCourseName() {
         return this.courseName;
    }


}

