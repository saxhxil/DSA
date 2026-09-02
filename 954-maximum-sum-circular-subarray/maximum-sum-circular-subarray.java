class Solution {
    public static int MaxSub(int arr[]){
        int Max = Integer.MIN_VALUE;
        int sum =0;
        for(int i=0;i<arr.length;i++){
             sum += arr[i];
            if(sum > Max) Max = sum;
            if(sum < 0 ) sum = 0;
        }
        return Max;
    }
     public static int MinSub(int arr[]){
        int Min = Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum < Min) Min = sum;
            if(sum > 0 ) sum = 0;
        }
        return Min;
    }
    public int maxSubarraySumCircular(int[] nums) {
        int summation= Arrays.stream(nums).sum();
        int maxsidesum = summation - MinSub(nums);
        if(MaxSub(nums) < 0) return MaxSub(nums);
        return Math.max(MaxSub(nums),maxsidesum);
    }
}