public class Leap_Year_or_Not {
    public static void main(String[] args) {
        int year=1996;
        if((year%4==0) && (year%100!=0)|| (year%400==0)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
