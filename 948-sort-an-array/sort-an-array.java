class Solution {
    // git
    public void merge(int arr[],int low,int mid,int high){
        List<Integer>list = new ArrayList<>();
        int  right = mid+1;
        int left=low;
        while(low <= mid && right <= high){
            if(arr[low] <= arr[right]){
                list.add(arr[low]);
                low++;
            }
            else{
                list.add(arr[right]);
                right++;
            }
        }
        while(low <= mid){
            list.add(arr[low]);
            low++;
        }
        while(right <= high){
            list.add(arr[right]);
            right++;
        }
        for(int i=left;i<=high;i++){
            arr[i]=list.get(i-left);
        }
    }
    public void mergesort(int arr[],int low,int high){
        if(low == high) return;
        int mid= (low+high)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);

    }
    public int[] sortArray(int[] nums) {
        int n= nums.length;
        mergesort(nums,0,n-1);
        return nums;
    }
}