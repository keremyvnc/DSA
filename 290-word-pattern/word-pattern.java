class Solution {
    //keremyvnc
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.trim().split("\\s+");
        if(words.length != pattern.length()) return false;

        HashMap<Character, Integer> charMap = new HashMap<>();
        HashMap<String, Integer> wordMap = new HashMap<>();
        
        for(int i = 0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            String w = words[i];
            if(!charMap.containsKey(c)) {
                charMap.put(c, i);
            }
            if(!wordMap.containsKey(w)) {
                wordMap.put(w, i);
            }
            if(!charMap.get(c).equals(wordMap.get(w))) {
                return false;
            }
        }
        return true;
        
    }
}