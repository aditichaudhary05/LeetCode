class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        int[] arr = new int[26];

        // Increment frequency for characters in s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            arr[ch - 'a']++;
        }

        // Decrement frequency for characters in t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            arr[ch - 'a']--;
        }

        // Check if all frequencies are zero
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }

        return true;
    }
}