class Solution {
    public int maximumSum(int[] arr) {
        int nodelete = arr[0];
        int onedelete = Integer.MIN_VALUE;
        int res = arr[0];
        for(int i=1;i<arr.length;i++){
            int PrevNoDelete = nodelete;
            int PrevOneDelete = onedelete;
            nodelete = Math.max((nodelete+arr[i]),arr[i]);
            int v3;
            if(PrevOneDelete == Integer.MIN_VALUE){
                v3 = arr[i];
            }
            else{
                v3 = PrevOneDelete + arr[i];
            }
            onedelete = Math.max(v3,PrevNoDelete);
            res = Math.max(res,Math.max(nodelete,onedelete));
        }
        return res;
    
    }
}