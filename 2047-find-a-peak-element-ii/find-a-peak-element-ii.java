class Solution {
    public static int rowmax(int arr[][],int n ,int col){
        int index =0;
        int max = arr[0][col];
        for(int i=0;i<n;i++){
            if(arr[i][col] > max ){
                max = arr[i][col];
                index = i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low = 0;
        int high = m-1;
        while(low <= high){
            int mid = (low + high)/2;
            int rowMax = rowmax(mat,n,mid);
            int left = (mid-1 >= 0) ?  mat[rowMax][mid-1] : -1;
            int right= (mid +1 < m) ? mat[rowMax][mid+1] : -1;
            if(mat[rowMax][mid] > left && mat[rowMax][mid] > right){
                return new int []{rowMax,mid};
            }
            else if (mat[rowMax][mid] < left) high= mid-1;
            else low = mid +1;
        }
        return new int []{-1,-1};
    }
}