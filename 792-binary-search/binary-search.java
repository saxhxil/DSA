class Solution {
    public static int BS(int nums[],int low ,int high , int tar){
        if(low > high ) return -1;
        int mid = (low+high)/2;
        if(tar > nums[mid]){
        return  BS(nums,mid+1,high,tar);
         }
        else if (tar < nums[mid]){
        return BS(nums,low,mid-1,tar);
        }
        else {
        return mid;
        }
        
    }
    public int search(int[] nums, int target) {
       return BS(nums,0,nums.length-1,target);
    
    }
}