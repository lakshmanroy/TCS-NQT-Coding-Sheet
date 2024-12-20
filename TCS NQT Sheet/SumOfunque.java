import java.util.HashMap;

public class SumOfunque {
    public static int SumOfUnque(int nums[]){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int sum=0;

        // Add numbers that appear only once

        for(int num:map.keySet()){
            if(map.get(num)==1){
                sum+=num;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,2};
        System.out.println(SumOfUnque(nums));
    }
}
