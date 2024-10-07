public class PalindromeString {
    public static int Palindrome(String s){
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        String s="abba";

        System.out.println(Palindrome(s));
    }
}
