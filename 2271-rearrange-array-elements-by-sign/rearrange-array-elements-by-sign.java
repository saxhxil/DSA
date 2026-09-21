class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int temp []= new int [n];
        int posindex=0;
        int negindex=1;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                temp[negindex]=nums[i];
                negindex += 2;
            }
            else{
                temp[posindex]=nums[i];
                posindex +=2;
            }
        }
        return temp;        
    }
}