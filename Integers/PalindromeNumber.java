/* Time: O(log(n)) Space: O(1) */
public class PalindromeNumber {
    public static boolean checkPalindrome(int n){
        int reversed = 0, remainder = 0;
        /* Negative numbers are not palindromes */
        if(n < 0){
            return false;
        }
        /* Single digit numbers are palindorme */
        if(n / 10 == 0){
            return true;
        }
        /* If last digit is 0, or number is negative, then it not palindrome*/
        if(n % 10 == 0){
            return false;
        }
        while(n > reversed){
            remainder = n % 10 ;
            reversed = reversed * 10 + remainder ;
            n = n / 10;
        }
        if(reversed == n || reversed/10 == n){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(checkPalindrome(12321));
    }
    
}
