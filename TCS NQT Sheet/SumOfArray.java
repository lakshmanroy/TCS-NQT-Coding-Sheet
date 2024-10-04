public class SumOfArray {
    public static int sumArray(int arr[]){
        int sum=0;
        int i=0;
        while(i<arr.length){
            sum+= arr[i];
            i++;
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4};

        System.out.println(sumArray(arr));
    }
}
