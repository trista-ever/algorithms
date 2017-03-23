public class Solution {
    public int titleToNumber(String s) {
         int res=0;
         for(int i=0;i<s.length();i++){ //start from high position
             res = res * 26 + (s.charAt(i) - 'A' + 1); // the way to change 'A' to number
         }
         return res;
    }
}
