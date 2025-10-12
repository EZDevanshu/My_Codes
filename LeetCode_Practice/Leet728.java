class Solution {
    public boolean isself(int n){
        int safe=n;
        while(n!=0){
            int rem=n%10;
            if(rem==0){
                return false;
            }
            if(safe%rem!=0){
                return false;
            }
            n/=10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
       List<Integer> list=new ArrayList<>();
       for(int i=left;i<=right;i++){
       if(isself(i)){
        list.add(i);
       }
       } 
       return list;
    }
}
