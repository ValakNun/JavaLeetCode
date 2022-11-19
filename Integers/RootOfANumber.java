/* Calculate Root of a number using Newton-Raphson method */
public class RootOfANumber {
    public static double NthRootOfNumber(double b, long n){
        double result = 1;
        int number_of_iterations  = 5;
        while (number_of_iterations != 0){
            result = (b + (n-1) * Math.pow(result, n))/(n * Math.pow(result, n-1));
            number_of_iterations -= 1;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(NthRootOfNumber(5, 5));
    }
    
}
