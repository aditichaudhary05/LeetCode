class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count=0;
        ArrayList<Integer> list = new ArrayList<>();
        int n=nums.length;
        for(int i=0; i<n;i++){
            count=1;
            if(list.contains(nums[i])) {
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>n/3){
                list.add(nums[i]);
            }
        }
        return list;
    }
}