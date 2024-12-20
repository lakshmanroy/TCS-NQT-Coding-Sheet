import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class maxFrequency {
    public static int maxFrequencyElement(int nums[]){
        Map<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

      int maxFrequency = Collections.max(map.values());

      int totalMaxFrequency=0;
      for(int freq:map.values()){
         if(freq==maxFrequency){
            totalMaxFrequency+=freq;
         }
      }
      return totalMaxFrequency;

    }
    public static void main(String[] args) {
        int nums[]={1,2,2,3,1,4};

        System.out.println(maxFrequencyElement(nums));
    }
}
