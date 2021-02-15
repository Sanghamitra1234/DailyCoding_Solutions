class Solution {
    public int maxNonAdjacent(int[] nums) {
        
        if(nums.length==1) return nums[0];
        
        int [] mem=new int[nums.length];
        mem[0]=nums[0];
        mem[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            mem[i]=Math.max(mem[i-1],mem[i-2]+nums[i]);
            mem[i]=Math.max(mem[i],nums[i]);
        }
        return mem[nums.length-1];
    }
}

O(n) //Kind of like knapsack
