/* LeetCode Link: https://leetcode.com/problems/fizz-buzz/ */
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz{
    public static List<String> generate(int n){
        List<String> list = new ArrayList<>();
        for(int i = 1; i<=n ; i++){
            if(i % 15 == 0){
                list.add("FizzBuzz");
            }
            else if(i % 3 == 0 ){
                list.add("Fizz");
            }
            else if (i % 5 == 0){
                list.add("Buzz");
            }
            
            else{
                list.add(Integer.toString(i));
            }
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(generate(15));    
    }
}