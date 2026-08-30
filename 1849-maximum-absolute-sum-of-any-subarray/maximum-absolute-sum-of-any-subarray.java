class Solution {
    public static int Maxsum(int arr[]){
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
             sum += arr[i];
            if(sum > maxsum) maxsum = sum;
            if(sum < 0)sum =0;
        }
        return maxsum;
    }
    public int Minsum(int[] arr) {
        int minsum = Integer.MAX_VALUE;
        int sum =0;
        for(int i=0;i<arr.length;i++){
             sum += arr[i];
            if(sum < minsum) minsum = sum;
            if(sum > 0) sum = 0;
        }
        return minsum;
    }
    public int maxAbsoluteSum(int[] nums) {
        int absmin = -(Minsum(nums));
        return Math.max(Maxsum(nums),absmin);
    }
}