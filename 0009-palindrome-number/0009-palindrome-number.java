class Solution {
    public boolean isPalindrome(int x) {
        int r=0;
        int rev=0;
        int temp=x;
        while(x>0){
            r=x%10;
            x=x/10;
            rev=rev*10+r;
        }
        if(temp==rev){
            return true;
        }
        else{
            return false;
        }
    }
}