class Solution {
    public int climbStairs(int n) {
        if(n<=0) return 0;
        if(n<=1) return n;
        
        int [] res=new int[n];
        res[0]=1;
        res[1]=2;
        
        for(int i=2;i<n;i++){
            res[i]=res[i-1]+res[i-2];
        }
        
        return res[n-1];
    }
}
//Time complexity is O(n) ans space O(n) => space can be decreased if we take just two variables to keep the last two stairs value instead of array
//Like fibonacci series. 
//https://leetcode.com/problems/climbing-stairs/
