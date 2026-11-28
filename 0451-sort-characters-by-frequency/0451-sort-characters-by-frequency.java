class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
       
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        ArrayList<Character> chars = new ArrayList<>(freq.keySet());
        chars.sort((a, b) -> freq.get(b) - freq.get(a));

        for (char ch : chars) {
            for (int i = 0; i < freq.get(ch); i++) {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}