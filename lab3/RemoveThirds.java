
import java.util.*;
public class RemoveThirds{

    public static ArrayList<Integer> remove_thirds(ArrayList<Integer> array){
        int i=0;
        while(i<array.size()){
            if((array.get(i) % 3)==0){
                array.remove(i);
            }
            else{
                i++;
            }
        }
        
        return array;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>(20);
        int[] array={1,2,3,2,5,3,1,3,9};
        
        
        for(int i : array){
            arrlist.add(i);
        }
        //System.out.println(arrlist);
        arrlist=remove_thirds(arrlist);
        System.out.println(arrlist);
       
    }
}
