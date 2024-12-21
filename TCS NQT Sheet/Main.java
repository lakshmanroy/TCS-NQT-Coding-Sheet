import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static List<Integer> findRepeatingElements(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> repeatingElements = new ArrayList<>();

        // Count occurrences of each element
       for(int num:arr){
         map.put(num,map.getOrDefault(num,0)+1);
       }

        // Find elements with count > 1
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                repeatingElements.add(key);
            }
        }

        return repeatingElements;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,2,3,4,4,5,2};

        List<Integer> result = findRepeatingElements(arr);
        if (result.isEmpty()) {
            System.out.println("No repeating elements found.");
        } else {
            System.out.println("Repeating elements: " + result);
        }
    }
}
