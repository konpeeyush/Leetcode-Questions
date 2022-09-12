class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>() ;
        List<Integer> output=new ArrayList<>() ;
        int index=0 ;
        fun(nums,output,index,ans) ;
        return ans ;
    }
    private static void fun(int[] nums,List<Integer> output,int index,List<List<Integer>> ans){
        if(index>=nums.length){
            ans.add(new ArrayList<>(output));
            return ;
        }
        //include
        
        int element=nums[index] ;
        output.add(element) ;
        fun(nums,output,index+1,ans) ;
        
        //exclude
        output.remove(output.size()-1) ;
        fun(nums,output,index+1,ans) ;
       
    }
}