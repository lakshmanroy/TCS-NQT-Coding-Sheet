import java.util.Arrays;
public class SortArray {
    public static int[] sortArr(int arr[]){
        Arrays.sort(arr);

        return arr;
    }
    public static void main(String[] args) {
        int arr[]= {1,5,3,2};

        int result[]=sortArr(arr);

        System.out.println(Arrays.toString(result));
    }
}
