public class Fibonacci_series {
    public static void main(String[] args) {
        int n=100;
        int a=0,b=1;
        for(int i=2;i<n;i++){
            int next=a+b;
            System.out.print(next+ " ");
            a=b;
            b=next;
        }
    }
}
