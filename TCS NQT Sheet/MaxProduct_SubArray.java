public class MaxProduct_SubArray {
    public static long maxProduct(int arr[]){
        if(arr==null || arr.length==0){
            return 0;
        }
        long maxProduct=arr[0];
        long minProduct=arr[0];
        long result=arr[0];
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]<0){
                long temp=maxProduct;
                maxProduct=minProduct;
                minProduct=temp;
            }
            maxProduct=Math.max(arr[i],maxProduct*arr[i]);
            minProduct=Math.min(arr[i],minProduct*arr[i]);

            result=Math.max(result,maxProduct);
        }
       return result;
    }
    public static void main(String[] args) {
        int arr[]= {6, -3, -10, 0, 2};

        System.out.println(maxProduct(arr));
    }
}
