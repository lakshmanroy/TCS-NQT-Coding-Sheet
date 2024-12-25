public class PrimeInRange{
    public static boolean isPrime(int nums){
        if(nums<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(nums);i++){
            if(nums%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primeRange(int min,int max){
        for(int i=min;i<=max;i++){
            if(isPrime(i)){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        int min=2;
        int max=10;
        System.out.println("range is "+min+ " and " +max + ":");
        primeRange(min,max);
    }
}