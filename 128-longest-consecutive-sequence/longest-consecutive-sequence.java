class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int x: nums){
            set.add(x);
        }
        int len=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int count=1;
                int x=num;
                while(set.contains(x+1)){
                    count++;
                    x=x+1;
                }
                if(count>len){
                    len = count;
                }
            }

        }
        return len;

    }
}