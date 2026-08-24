class Solution {
    public int[] sortedSquares(int[] nums) {
        List <Integer> pos = new ArrayList<>();
         List <Integer> neg = new ArrayList<>();
    for(int x : nums){
        if(x < 0){
            neg.add(x);
        }
        else{
            pos.add(x);
        }
    }
    if(neg.size() ==0){
        for(int i=0;i<pos.size();i++){
        pos.set(i,pos.get(i)*pos.get(i));
         }
         return pos.stream().mapToInt(Integer :: intValue).toArray();
    }
   if(pos.size() ==0){
        for(int i=0;i<neg.size();i++){
        neg.set(i,neg.get(i)*neg.get(i));
        }
         Collections.reverse(neg);
         return neg.stream().mapToInt(Integer :: intValue).toArray();
    }
    for(int i=0;i<pos.size();i++){
        pos.set(i,pos.get(i)*pos.get(i));
         }
     for(int i=0;i<neg.size();i++){
        neg.set(i,neg.get(i)*neg.get(i));
     }
      Collections.reverse(neg);
    int n =neg.size();
    int m = pos.size();
    int i =0;
    int j =0;
    int arr [] = new int [n+m];
    int id =0;
    while( i<n && j<m){
        if(neg.get(i) <= pos.get(j)){
            arr[id++]=neg.get(i++);
        }
        else{
            arr[id++]=pos.get(j++);
        }
    }
    while( i < n){
        arr[id++]=neg.get(i++);
    }
    while(j < m){
        arr[id++] = pos.get(j++);
    }
    return arr;


    }
}