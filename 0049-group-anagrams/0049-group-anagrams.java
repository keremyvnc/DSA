class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);

            if(map.containsKey(sorted)){
                map.get(sorted).add(strs[i]);
            }
            else{
                map.put(sorted, new ArrayList<String>(List.of(strs[i])));
            }
        }
        
        return new ArrayList<>(map.values());
    }
}