public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        StringBuffer result = new StringBuffer("");
        for(int i = 0; i < strs[0].length() ; i++){
            char check = strs[0].charAt(i);
            for(int j = 1 ; j < strs.length ; j++){
                if(i == strs[j].length() || strs[j].charAt(i) != check) return result.toString();
            }
            result.append(check);
        }
        return result.toString();
    }
    public static void main(String args[]){
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(longestCommonPrefix(new String[]{"ab","a"}));
    }
}
