import java.util.HashSet;

public class CheckSubset {
    public static boolean isSubset(int[] arr1, int[] arr2) {
        // If arr1 is empty, it is always a subset of arr2
        if (arr1.length == 0) {
            return true;
        }
        
        // If arr2 is empty but arr1 is not, arr1 can't be a subset of arr2
        if (arr2.length == 0) {
            return false;
        }

        // Convert arr2 into a HashSet for faster lookups
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr2) {
            set.add(num);
        }

        // Check if all elements of arr1 are present in the HashSet of arr2
        for (int num : arr1) {
            if (!set.contains(num)) {
                return false; // If any element is not found in arr2, return false
            }
        }

        return true; // If all elements of arr1 are found in arr2, return true
    }

    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = {1, 3, 4, 5, 2};
        int[] arr2 = {2, 4, 3, 1, 7, 5, 15};
        System.out.println("Test case 1: " + (isSubset(arr1, arr2) ? "arr1[] is a subset of arr2[]" : "arr1[] is not a subset of arr2[]"));
    }
}
