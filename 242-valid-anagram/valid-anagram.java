class Solution {
    public boolean isAnagram(String s, String t) {
        // keremyvnc
        HashMap<Character, Integer> map = new HashMap<>();
        if(s.length() != t.length()) return false;
        for(char c: s.toCharArray()){
            if(!map.containsKey(c)) {
                map.put(c, 1);
            }
            else {
                map.put(c, map.get(c)+1);
            }
        }
        for(char c: t.toCharArray()){
            if(!map.containsKey(c)) return false;
            else {
                if(map.get(c) == 0) return false;
                map.put(c, map.get(c)-1);
            }
        } 
        return true;
    }
}