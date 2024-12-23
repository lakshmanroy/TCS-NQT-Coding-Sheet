public class ArrayRotation {

    // Function to rotate an array to the left by d steps
    public static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n;
    
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
        
    }
    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int d = 2;  
        
        rotateArr(arr, d);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
