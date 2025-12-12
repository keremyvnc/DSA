class Solution {
    // keremyvnc
    public int lengthOfLastWord(String s) {
        int count = 0;
        int lastLetter = s.length() -1;
        while(s.charAt(lastLetter) == ' ' && lastLetter>=0){
            lastLetter--;
        }
        while(lastLetter>=0 && s.charAt(lastLetter) != ' '){
            count++;
            lastLetter--;
        }
        return count;
    }
}