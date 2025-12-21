class Solution {
    //keremyvnc
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length != pattern.length()) return false;

        HashMap<Character, String> charToWord = new HashMap<>();
        HashSet<String> wordSet = new HashSet<>();
        
        for(int i = 0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            String w = words[i];
            if(charToWord.containsKey(c)) {
                if(!charToWord.get(c).equals(w)) return false;
            }
            else {
                if(wordSet.contains(w)) return false;
                charToWord.put(c,w);
                wordSet.add(w);
            }
        }
        return true;
        
    }
}