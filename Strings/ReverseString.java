/* Leetcode : https://leetcode.com/problems/reverse-string/ */
class Solution {
    public static char[] reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while(left < right){
            char temp = s[left] ;
            s[left] = s[right] ;
            s[right] = temp ;
            left += 1;
            right -= 1;
        }
        return s;
    }
    public static void main(String[] args){
        System.out.println(reverseString(new char[]{'h','e','l','l','o'}));
        System.out.println(reverseString(new char[]{'h','a','n','n','a','H'}));
    }
}