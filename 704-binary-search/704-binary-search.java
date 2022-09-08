class Solution {
    public int search(int[] nums, int target) {
        return helper(nums,0,nums.length,target) ;
    }
    public static int helper(int[] nums, int start,int end,int target){
        if(start>=end)
            return -1 ;
        int mid=start+(end-start)/2 ;
        if(nums[mid]==target)
            return mid ;
        if(target<nums[mid]){
            return helper(nums,start,end-1,target) ;
        }
        return helper(nums,start+1,end,target) ;
    }
}