class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtracking(new ArrayList<>(), 0, nums);
        return result;
    }

    void backtracking(List<Integer> solution, int i, int[] nums) {
        if(i==nums.length){
            result.add(new ArrayList<>(solution));
            return;
        }
        
        solution.add(nums[i]);
        backtracking(solution, i+1, nums);
        solution.remove(solution.size()-1);
        backtracking(solution, i+1, nums);
    }


}