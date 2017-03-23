/*
Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.

*/



public class Solution {
    public int trailingZeroes(int n) {
         return n==0?0:n/5+trailingZeroes(n/5);
        
    }
}

public class Solution {
    public int trailingZeroes(int n) {
        int count =0 ;
        for(long i=5;n/i>=1; i*5){  //long
            count+=n/i;
        }
        
    }
    return count;
}
