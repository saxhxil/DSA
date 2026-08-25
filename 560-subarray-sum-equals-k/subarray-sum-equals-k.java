class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap <Integer,Integer>map = new HashMap <>();
        int psum=0;
        int count=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            psum += nums[i];
            int need = psum-k;
            count = count + map.getOrDefault(need,0);
            map.put(psum,map.getOrDefault(psum,0)+1);
        }
        return count;
    }
}