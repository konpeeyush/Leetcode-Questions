class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>() ;
        while(n!=1){
            int current=n ;
            int sum=0 ;
            while(current!=0){
                sum+=Math.pow(current%10,2) ;
                current/=10 ;
            }
            if(set.contains(sum))
                return false ;
            set.add(sum) ;
            n=sum ;
        }
        return true ;
    }
}