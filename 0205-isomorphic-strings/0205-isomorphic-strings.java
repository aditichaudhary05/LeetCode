class Solution {
    public boolean isIsomorphic(String s, String t) {
       int S=s.length();
       int T=t.length();
       if(S!=T)return false;

       HashMap<Character, Character> map = new HashMap<>();
       HashSet<Character> set = new HashSet<>(); 
       for(int i=0; i<S; i++){
        if(map.containsKey(s.charAt(i))==false){
            if(set.contains(t.charAt(i))){
                return false;
            }
            else{
                map.put(s.charAt(i), t.charAt(i));
                set.add(t.charAt(i));
            }
        } else if(map.get(s.charAt(i)) != t.charAt(i)){
            return false;
        }
       }
       return true;
    }
}