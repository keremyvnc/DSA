class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> elements = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int diff = target-nums[i];
            if(elements.containsKey(diff)){
                return new int[] {elements.get(diff), i};
            }
            else {
                elements.put(nums[i], i);
            }
        }
        return null;
    }
}