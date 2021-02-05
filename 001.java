class Solution {
    public boolean twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h=new  HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(!h.containsKey(nums[i])){
                h.put(nums[i], i);
            }
            
            //To check the sum part
            int k=target-nums[i];
            if(h.containsKey(k) && h.get(k)!=i){
                return true;
            }
        }
        return false;
    }
}

Leetcode Link : https://leetcode.com/problems/two-sum/
