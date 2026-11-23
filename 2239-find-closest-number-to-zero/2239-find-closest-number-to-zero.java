class Solution {
    public int findClosestNumber(int[] nums) {
        int distance=0;
        int closestDistance=Integer.MAX_VALUE;
        int closeN=0;
        for(int i=0; i<nums.length; i++){
            distance=Math.abs(nums[i]);
             if (distance < closestDistance ||
                (distance == closestDistance && nums[i] > closeN)) {

                closestDistance = distance;
                closeN = nums[i];
        }}
        return closeN;
    }
}