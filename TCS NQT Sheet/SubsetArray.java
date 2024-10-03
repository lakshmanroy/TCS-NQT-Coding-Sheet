import java.util.HashMap;

class SubsetArray {
    public String isSubset(long a1[], long a2[], long n, long m) {
        
        // Use HashMap with Long keys and Integer values to store frequencies
        HashMap<Long, Integer> freqA1 = new HashMap<>();
        HashMap<Long, Integer> freqA2 = new HashMap<>();
        
        // Count the frequency of elements in a1
        for (long num : a1) {
            freqA1.put(num, freqA1.getOrDefault(num, 0) + 1);
        }
        
        // Count the frequency of elements in a2
        for (long num : a2) {
            freqA2.put(num, freqA2.getOrDefault(num, 0) + 1);
        }
        
        // Check if a2 is a subset of a1
        for (Long key : freqA2.keySet()) {
            if (freqA2.get(key) > freqA1.getOrDefault(key, 0)) {
                return "No";
            }
        }
        
        return "Yes";
    }
    
    public static void main(String[] args) {
        SubsetArray obj = new SubsetArray();
        
        long[] a1 = {11, 7, 1, 13, 21, 3, 7, 3};
        long[] a2 = {11, 3, 7, 1, 7};
        
        long n = a1.length;
        long m = a2.length;
        
        System.out.println(obj.isSubset(a1, a2, n, m));  // Output: Yes
    }
}
