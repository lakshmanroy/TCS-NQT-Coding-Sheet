public class NaturalNumber {
    public static void FindSum(int nums){
        int sum=0;
        for(int i=1;i<=nums;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
public static void main(String[] args) {
    int nums=5;
    FindSum(nums);
}
}