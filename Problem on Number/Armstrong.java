public class Armstrong {
    public static boolean isArmstrong(int n){
        int sum=0;
        int original=n;
        while(n>0){
            int lastDigit=n%10;
            sum+=(lastDigit*lastDigit*lastDigit);
            n=n/10;
        }
        return original==sum;
    }
    public static void main(String[] args) {
        int n=153;
        if(isArmstrong(n)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}