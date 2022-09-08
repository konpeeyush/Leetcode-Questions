class Solution {
    public int search(int[] nums, int target) {
        return helper(nums,0,nums.length-1,target) ;
    }
    public static int helper(int[] arr, int start,int end,int target){
        if(start<=end){
            int mid=start+(end-start)/2 ;
            if(arr[mid]==target) return mid ;
            if(arr[mid]<target)
                return helper(arr,mid+1,end,target) ;
            else
                return helper(arr,start,mid-1,target) ;
        }
        return -1 ;
    }
}