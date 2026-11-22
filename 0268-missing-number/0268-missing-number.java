class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum= n*(n+1)/2;
        int j=0;
        for(int i=0; i<n; i++){
            j=j+nums[i];
        }
        int missing=sum-j;
        return missing;
    }
}