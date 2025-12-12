class Solution {
    // keremyvnc
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int p1=0;
        int p2=0;
        String str1 = strs[0];
        String str2 = strs[strs.length-1];
        StringBuilder prefix = new StringBuilder("");
        while(p1<str1.length() && p2<str2.length()){
            if(str1.charAt(p1) == str2.charAt(p2)) {
                prefix.append(str1.charAt(p1));
                p1++;
                p2++;
            }
            else return prefix.toString();
        }
        return prefix.toString();
    }
}