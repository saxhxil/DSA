class Solution {
    public static int BS(int nums[],int st ,int end , int tar){
        if(st > end ) return -1;
        int mid = (st+end)/2;
        if(tar > nums[mid]){
        return  BS(nums,mid+1,end,tar);
         }
        else if (tar < nums[mid]){
        return BS(nums,st,mid-1,tar);
        }
        else {
        return mid;
        }
        
    }
    public int search(int[] nums, int target) {
       return BS(nums,0,nums.length-1,target);
    
    }
}