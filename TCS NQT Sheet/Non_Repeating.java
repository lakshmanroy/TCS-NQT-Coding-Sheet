import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Non_Repeating {
    public static List<Integer>nonRepeating(int nums[]){
        HashMap<Integer,Integer>map=new HashMap<>();
        List<Integer>result=new ArrayList<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)==1){
                result.add(key);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[]={1,2,-1,1,3,1};

        List<Integer>res=nonRepeating(nums);
        if(res.isEmpty()){
            System.out.println("No non Repeating found");
        }
        else{
            System.out.println("non repeating element: "+res);
        }
    }
}