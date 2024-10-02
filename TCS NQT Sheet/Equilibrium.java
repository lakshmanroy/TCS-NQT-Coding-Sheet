
public class Equilibrium {
    public static String equilibrium(int arr[]){
        int totSum=0;

        for(int num:arr){
            totSum+=num;
        }
        int leftSum=0;
        for(int i=0;i<arr.length;i++){
            int rightSum=totSum-leftSum-arr[i];

            if(leftSum==rightSum){
                return "true";
            }
            leftSum=arr[i];
        }
        return "false";
    }
public static void main(String[] args) {
    int arr[]= {1,2,3,3};

    System.out.println(equilibrium(arr));
}
    
}