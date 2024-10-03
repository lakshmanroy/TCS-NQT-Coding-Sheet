public class ReverseString {
    public static String reverseString(String s){
        char ch[]= s.toCharArray();
        int left=0,right=s.length()-1;

        while(left<right){
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;

            left++;
            right--;
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        String s="Geeks";

        System.out.println(reverseString(s));
    }
}
