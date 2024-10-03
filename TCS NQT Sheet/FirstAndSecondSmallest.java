public class FirstAndSecondSmallest {
    public static int[] minAnd2Min(int arr[]) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (secondSmallest > arr[i] && smallest != arr[i]) {
                secondSmallest = arr[i];
            }
        }

        // If no second smallest element was found, return an empty array
        if (secondSmallest == Integer.MAX_VALUE) {
            return new int[]{}; // This returns an empty array
        }

        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        FirstAndSecondSmallest obj = new FirstAndSecondSmallest();

        int arr[] = {2, 4, 3, 5, 6}; // Example input with identical elements

        int result[] = obj.minAnd2Min(arr);

        // Check if the result array is empty before trying to print
        if (result.length == 0) {
            System.out.println("-1"); // Output -1 if no valid second smallest element
        } else {
            System.out.println(result[0] + " " + result[1]); // Print smallest and second smallest
        }
    }
}
