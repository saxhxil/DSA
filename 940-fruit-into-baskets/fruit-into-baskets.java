class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int left=0;
        int max=Integer.MIN_VALUE;
        int n=fruits.length;
        for(int high=0;high<n;high++){
            int El= fruits[high];
            map.put(El,map.getOrDefault(El,0)+1);
            if(map.size()>2){
                int leftint=fruits[left];
                map.put(leftint,map.get(leftint)-1);
                if(map.get(leftint)==0){
                    map.remove(leftint);
                }
                left++;
            }
                max=Math.max(max,high-left+1);
        }
        return max;
    }
}