class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] output=new int[nums.length];
        int k=0;
        for(int i=0, j=n; i<n; i++, j++){
            output[k]=nums[i];
            output[k+1]=nums[j];

            k+=2;
        }
        return output;
    }
}