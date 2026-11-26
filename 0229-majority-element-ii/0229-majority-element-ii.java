class Solution {
    public List<Integer> majorityElement(int[] nums) {
         ArrayList<Integer> list = new ArrayList<>();
        int count1=0;
        int el1=0;
        int count2=0;
        int el2=0;
        for(int i=0; i<nums.length; i++){
            if(count1==0 && nums[i]!=el2){
                count1=1;
                el1=nums[i];
            }
            else if(count2==0 && nums[i]!=el1){
                count2=1;
                el2=nums[i];
            }
            else if(nums[i]==el1){
                count1++;
            }
            else if(nums[i]==el2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        int count3=0;
        int count4=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==el1){
                count3++;
            }
            if(nums[i]==el2){
                count4++;
            }
        }
        if(count3>(nums.length/3)){
            list.add(el1);
        }
        if(count4>(nums.length/3) && el1 != el2){
            list.add(el2);
        }
        return list;
    }
}