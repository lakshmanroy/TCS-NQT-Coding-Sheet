public class AvergeElement {
    public static double  Average(int nums[]){
        int n=nums.length;
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
         return (double)sum/n;
    }

    public static void main(String[] args) {
        // int nums[]={1,2,1,1,5,1};
        int nums[]={1,2,3,4,5};
        System.out.println(Average(nums));
    }
}
