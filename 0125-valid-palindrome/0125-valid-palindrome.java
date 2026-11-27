class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]","");
        String temp=s;
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        return temp.equals(sb.toString());
    }
}