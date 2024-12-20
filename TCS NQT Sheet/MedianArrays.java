import java.util.*;
public class MedianArrays {
    public static double FindMedian(int nums[]){
        int n=nums.length;
        Arrays.sort(nums);
        if(n%2==1){
            return nums[n/2];
        }
        else{
            return nums[n/2-1]+nums[n/2]/2.0;
        }  
    }
    public static void main(String[] args) {
        int nums[]={2,5,1,7};
        System.out.println(FindMedian(nums));
    }
}
