class Solution {
    public int threeSumClosest(int[] nums, int target) {
       int n  = nums.length;
       int maxdiff=Integer.MAX_VALUE;
       int rSum=0;
       Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            int left = i+1;
            int right = n-1;
            int f = nums[i];
            while( left < right){
                int sum= f+nums[left]+nums[right];
                if(sum == target){
                maxdiff=0;
                rSum=sum;
                left++;
                right--;
               }
               else if(sum<target){
               int diff=target-sum;
               if(diff<maxdiff){
                maxdiff=diff;
               rSum=sum;
               }
               left++;
                
               }
               else{
                int diff = sum-target;
               if(diff<maxdiff){
                maxdiff= diff;
               rSum=sum;
               }
                right--;
               }
             }
        }
        return rSum;
    }
}