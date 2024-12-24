public class PerfectNumber {
    public static boolean isPerfect(int n){
        if(n<=1){
            return false;
        }
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum==n;
    }
    public static void main(String[] args) {
        int n=28;
        System.out.println(isPerfect(n));
    }
}
