/* Calculate Root of a number using Newton-Raphson method */
/* Square Root of a Number; Leetcode: https://leetcode.com/problems/sqrtx/ */
public class RootOfANumber {
    public static double NthRootOfNumber(double b, long n){
        double result = 1;
        int number_of_iterations  = 20;
        while (number_of_iterations != 0){
            result = (b + (n-1) * Math.pow(result, n))/(n * Math.pow(result, n-1));
            number_of_iterations -= 1;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(NthRootOfNumber(625, 2));
    }
    
}
