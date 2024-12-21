
public class CheckPalindrome {
    public static boolean isPalindrome(int n){
        String str=Integer.toString(n);
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
      int n= 51415;  
      System.out.println(isPalindrome(n));
    }
}
