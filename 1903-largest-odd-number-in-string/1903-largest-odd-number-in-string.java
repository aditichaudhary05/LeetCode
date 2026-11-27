class Solution {
    public String largestOddNumber(String num) {
        int l=num.length()-1;
        for(int j=l;j>=0;j--){
            int digit = num.charAt(j) - '0';
            if(digit%2!=0){
                return num.substring(0, j + 1);
            }
        }
        return "";
    }
}