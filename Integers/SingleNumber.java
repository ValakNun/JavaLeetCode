/* LeetCode: https://leetcode.com/problems/single-number/ */
public class SingleNumber {
    public static int findSingleNumber(int[] nums){
        int xor_arr = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            xor_arr = xor_arr ^ nums[i];
        }
        return xor_arr;
    }
    public static void main(String[] args){
        System.out.println(findSingleNumber(new int[]{1,1,2,2,3,3,4,5,5}));
    }
    
}
