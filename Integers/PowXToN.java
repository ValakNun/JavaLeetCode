/* LeetCode: https://leetcode.com/problems/powx-n/submissions/ */
/* Time: O(log2(n)); Space: O(1) */
public class PowXToN{
    /* Repeated Squaring */
    public static double myPow(double base, long exponent) {
        double result = 1;
        if (base == 1 || exponent == 0){
            return 1;
        }
        else if (exponent < 0){
            return myPow(1/base, -1*exponent) ;
        }
        else{
            while (exponent != 0) {
                if (exponent % 2 == 0){
                    base *= base ;
                    exponent = exponent/2 ;
                }
                else { 
                    result *= base ;
                    exponent = exponent - 1 ;
                }
            }
        }
        return result ;
    }
    public static void main(String[] args){
        System.out.println(myPow(2,14));
    }
}