class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2] ;
        int ans1=first(nums,target) ;
        int ans2=last(nums,target) ;
        ans[0]=ans1 ;
        ans[1]=ans2 ;
        return ans ;
    }
    static int first(int[] arr, int key){
        int start=0 ;
        int end=arr.length-1 ;
        int ans=-1 ;
        while(start<=end){
            int mid=start+(end-start)/2 ;
            if(arr[mid]==key){
                ans=mid ;
                end=mid-1 ;
            }
            else if(key<arr[mid]){
                end=mid-1 ;
            }
            else{
                start=mid+1 ;
            }
        }
        return ans ;
    }
    static int last(int[] arr, int key){
        int start=0 ;
        int end=arr.length-1 ;
        int ans=-1 ;
        while(start<=end){
            int mid=start+(end-start)/2 ;
            if(arr[mid]==key){
                ans=mid ;
                start=mid+1 ;
            }
            else if(key<arr[mid]){
                end=mid-1 ;
            }
            else{
                start=mid+1 ;
            }
        }
        return ans ;
    }
}