import java.util.HashMap;

public class Non_Repeating_Element {
    public static int FirstNonRepeating(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1) {
                return arr[i];
            }
        }
        return 0;
    }
public static void main(String[] args) {
    int arr[]= {-1, 2, -1, 3, 2};

    System.out.println(FirstNonRepeating(arr));
}
}