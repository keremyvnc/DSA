class Solution {
    // keremyvnc
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> s_map = new HashMap<>();
        HashMap<Character, Integer> t_map = new HashMap<>();

        for(int i = 0; i<s.length(); i++) {
            if(!s_map.containsKey(s.charAt(i))) {
                s_map.put(s.charAt(i), i);
            }
            if(!t_map.containsKey(t.charAt(i))) {
                t_map.put(t.charAt(i), i);
            }
            if(s_map.get(s.charAt(i))!=t_map.get(t.charAt(i))) return false;
        }
        return true;
    }
}