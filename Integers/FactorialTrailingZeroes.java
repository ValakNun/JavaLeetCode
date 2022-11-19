/* Leetcode: https://leetcode.com/problems/factorial-trailing-zeroes/ */
/* Time: O(log5(n)) Space: O(1) */
public class FactorialTrailingZeroes {
    public static int factorialZeroes(int n){
        /* Calculate power of 2 in n! */
        // int power_two = 0 ;
        // int start = 2 ;
        // while(n/start != 0){
        //     power_two += n/start ;
        //     start *= 2 ;
        // }
        
        /* Since always power of 5 in n! < power of 2 in n!; We can omit calculating power of 2 in n! */
        /* Calculate power of 5 in n! */
        int power_five = 0 ;
        int start = 5 ;
        while(n/start != 0){
            power_five += n/start ;
            start *= 5 ;
        }
        /* Return power of 10 in n! */
        return power_five;
    }

    public static void main(String[] args){
        System.out.println(factorialZeroes(20));
    }
    
}
