class Solution {
    // keremyvnc
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> s_map = new HashMap<>();
        HashMap<Character, Integer> t_map = new HashMap<>();

        for(int i = 0; i<s.length(); i++) {
            char s_c = s.charAt(i);
            char t_c = t.charAt(i);
            if(!s_map.containsKey(s_c)) {
                s_map.put(s_c, i);
            }
            if(!t_map.containsKey(t_c)) {
                t_map.put(t_c, i);
            }
            if(s_map.get(s_c)!=t_map.get(t_c)) return false;
        }
        return true;
    }
}