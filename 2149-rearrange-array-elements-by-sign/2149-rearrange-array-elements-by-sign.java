
class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        int[] result=new int[nums.length];

        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                positive.add(nums[i]);
            }else{
                negative.add(nums[i]);
            }

        }
        int p=0;
        int n=0;
        for(int i=0; i<nums.length; i++){
            if(i%2!=0){
                result[i] = negative.get(p++);
            }else{
                result[i] = positive.get(n++);
            }
        }
        return result;
    }
}