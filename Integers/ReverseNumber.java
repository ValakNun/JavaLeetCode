
/* LeetCode: https://leetcode.com/problems/reverse-integer/ */
/* Time: O(log10(n)) Space: O(1) */
public class ReverseNumber {
    public static int reverseNumber(int n){
        int max_integer = Integer.MAX_VALUE ;
        int min_integer = Integer.MIN_VALUE ;
        int reverse_integer = 0;
        int remainder = 0;
        while (n != 0) {
            remainder = n % 10 ;

            if (reverse_integer > max_integer/10 || reverse_integer < min_integer/10){
                return 0;
            }
            else if(reverse_integer == max_integer/10 && remainder > max_integer % 10){
                return 0 ;

            }
            else if(reverse_integer == min_integer/10 && remainder < min_integer % 10){
                return 0 ;
            }

            reverse_integer = reverse_integer * 10 + remainder ;
            n = n / 10 ;
        }
        return reverse_integer;
    } 
    public static void main(String[] args){
        System.out.println(reverseNumber(-2147483412));
    }
}
