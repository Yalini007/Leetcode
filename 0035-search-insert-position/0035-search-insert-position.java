class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target<nums[0]){
            return 0;
        }
        else if(nums[nums.length-1]<target){
            return nums.length;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<target&&nums[i+1]>=target){
                return i+1;
            }
        }
        return 0;
    }
}