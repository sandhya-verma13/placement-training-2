class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length();i++){
            if(nums[i]+nums[i+1]==target){
                return i,i+1;
            }
        }
        
    }
}
