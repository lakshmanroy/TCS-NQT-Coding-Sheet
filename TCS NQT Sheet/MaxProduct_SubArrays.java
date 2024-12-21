public class MaxProduct_SubArrays {
    public static int maxProducts(int nums[]){
        if(nums==null || nums.length==0){
            return 0;
        }
        int maxProduct=nums[0];
        int currMax=nums[0];
        int currMin=nums[0];

        for(int i=1;i<nums.length;i++){
           int current=nums[i];
           if(current<0){
            int temp=currMax;
            currMax=currMin;
            currMin=temp;
           }
            // Update currentMax and currentMin
            currMax=Math.max(current, currMax*current);
            currMin=Math.min(current,currMin*current);

            maxProduct=Math.max(maxProduct, currMax);
        }
        return maxProduct;
    }
    public static void main(String[] args) {
        int nums[]={2,3,-2,4};
        System.out.println("Maximum product :"+ maxProducts(nums));
    }
}
