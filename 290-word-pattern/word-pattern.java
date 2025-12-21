class Solution {
    // keremyvnc
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" "); // regex is not good
        if(words.length != pattern.length()) return false;
        HashMap<Character, Integer> charMap = new HashMap<>();
        HashMap<String, Integer> wordMap = new HashMap<>();
        
        for(int i = 0; i<pattern.length(); i++){
            if(!charMap.containsKey(pattern.charAt(i))) {
                charMap.put(pattern.charAt(i), i);
            }
            if(!wordMap.containsKey(words[i])) {
                wordMap.put(words[i], i);
            }
            if(!charMap.get(pattern.charAt(i)).equals(wordMap.get(words[i]))) {
                return false;
            }
        }
        return true;
        
    }
}