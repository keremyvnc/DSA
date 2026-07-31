class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        List<List<Integer>> bucket = new ArrayList<>(nums.length + 1);
        int[] topK = new int[k];
        for (int i = 0; i <= nums.length; i++) {
            bucket.add(new ArrayList<>());
        }
        for(int num : nums) {
            freq.put(num, 1 + freq.getOrDefault(num, 0));
        }
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            bucket.get(entry.getValue()).add(entry.getKey());
        }
        int kth = 0;
        for (int i = bucket.size() - 1; i >= 0; i--) {
            for (int num : bucket.get(i)) {
                topK[kth] = num;
                kth++;
                if (kth >= k) break;
            }
            if (kth >= k) break;
        }
        return topK;
    }
}