class Solution {
    public int maxProduct(int[] nums) {
        int pre=1;
        int suff=1;
        int maxProduct = Integer.MIN_VALUE;
        int n=nums.length;

        for(int i = 0; i < n; i++) {
           if(pre==0)pre=1;
           if(suff==0)suff=1;

           pre=pre*nums[i];
           suff=suff*nums[n-i-1];
           maxProduct=Math.max(maxProduct,Math.max(pre,suff));
        }

        return maxProduct;
    }
}