public class PrimeNumberRange {
    public static boolean isPrime(int nums){

        for(int i=2;i<Math.sqrt(nums);i++){
            if(nums%i==0){
                return false;
            }
        }
        return true;
    }
    public static void PrimeRange(int min,int max){
        for(int i=min;i<=max;i++){
            if(isPrime(i)){
                System.out.println(i+ " ");
            }
        }
    }
    public static void main(String[] args) {
        int min=10;
        int max=16;

        System.out.println("range is "+min+ "and"+ max+ ":");
        PrimeRange(min, max);

        
    }
}
