import java.util.Arrays;

public class IncreasingOrDecreasingNumber {
    public static void IncOrDec(int nums[]) {
        Arrays.sort(nums); // Sort the array in ascending order
        int n = nums.length;
        int[] arr = new int[n];

        // Copy the first half in increasing order
        for (int i = 0; i < n / 2; i++) {
            arr[i] = nums[i];
        }

        // Copy the second half in decreasing order
        for (int i = n / 2, j = n - 1; i < n; i++, j--) {
            arr[i] = nums[j];
        }

        // Print the rearranged array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = {8, 7, 1, 6, 5, 9}; // Fix: Added commas
        IncOrDec(nums); // Call the function
    }
}
