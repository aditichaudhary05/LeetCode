class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans=new ArrayList<>();
        long temp=1;
        ans.add(1);

        for(int i=1; i<=rowIndex; i++){
            temp=temp*(rowIndex-i+1);
            temp=temp/i;
            ans.add((int) temp);
        }
        return ans;
    }
}