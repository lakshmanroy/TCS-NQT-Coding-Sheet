
import java.util.Arrays;
import java.util.List;

public class CheckIf_Sorted {
    public static boolean isSorted(List<Integer>arr){
       int n=arr.size();
       for(int i=0;i<n-1;i++){
        if(arr.get(i)>arr.get(i+1)){
            return false;
        }
       }
       return true;
    }
    public static void main(String[] args) {
      List<Integer>arr=Arrays.asList(10,20,30,40,50);
      System.out.println(isSorted(arr));  
    }
}
