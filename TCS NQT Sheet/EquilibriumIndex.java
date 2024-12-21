public class EquilibriumIndex {

    public static int findEquilibriumIndex(int[] nums) {
        // Calculate total sum of the array
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        // Variable to keep track of the left sum
        int leftSum = 0;

        // Iterate through the array and check for equilibrium
        for (int i = 0; i < nums.length; i++) {
            // Calculate right sum by subtracting left sum and the current element from total sum
            int rightSum = totalSum - leftSum - nums[i];

            // If left sum equals right sum, we have found the equilibrium index
            if (leftSum == rightSum) {
                return i;
            }

            // Update the left sum for the next iteration
            leftSum += nums[i];
        }

        // Return -1 if no equilibrium index is found
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -1, 8, 4};
        int equilibriumIndex = findEquilibriumIndex(nums);
        System.out.println("The leftmost equilibrium index is: " + equilibriumIndex);
    }
}
