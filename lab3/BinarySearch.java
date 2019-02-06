public class BinarySearch{

    public static int binarySearch(int[] array,int v){
        int mid;
        int i=0;
        int j=array.length;
        while(i<j){
            mid=(i+j)/2;
            if(v<array[mid]){
                j=mid;
            }
            else if(v > array[mid]){
                i=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static String check(int v){
        if(v>=0){
            String s = v + "";
            return s;
        }
        return "None";
    }




    public static void main(String[] args) {
       int[] array={1,2,4,5,7,8,11,13};
       int n = binarySearch(array,0);
       String s= check(n);
       System.out.println(s);
    //    for(int i=0;i<array.length;i++){
    //         System.out.println(array[i]);
    //    }
       
    }
}
