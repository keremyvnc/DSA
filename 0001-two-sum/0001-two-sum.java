class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> elements = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            if(elements.containsKey(target-nums[i])){
                return new int[] {elements.get(target-nums[i]), i};
            }
            else {
                elements.put(nums[i], i);
            }
        }
        return null;
    }
}