public class PalindromRange {
    public static boolean isPalindrome(int n){
        int rev=0;
        int original=n;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n /= 10;
        }

        // Check if the original number is equal to the reversed number
        return original == rev;
    }

    public static void findPalindromes(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        int min=10;
        int max=50;

        System.out.println("palindrome number is "+min+ "and"+ max+ ":");
        findPalindromes(min, max);
    }
}
