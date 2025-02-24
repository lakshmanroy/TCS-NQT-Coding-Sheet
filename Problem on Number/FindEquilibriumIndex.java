public class FindEquilibriumIndex {
    public static int findEquilibrium(int nums[]){
        int totalSum=0;
        for(int num:nums){
            totalSum+=num;
        }
        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            int rightSum=totalSum-leftSum-nums[i];

            if(leftSum==rightSum){
                return i;
            }
            leftSum+=nums[i];
        }
        return totalSum;
    }
    public static void main(String args[]){
        int nums[]={2,3,-1,8,4};
        System.out.println(findEquilibrium(nums));
    }
}
