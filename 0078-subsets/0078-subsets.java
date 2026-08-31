class Solution {
    List<List<Integer>> result = new ArrayList<>();
    int[] nums;
    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;
        backtracking(new ArrayList<>(), 0);
        return result;
    }

    private void backtracking(List<Integer> solution, int i) {
        if(i==nums.length){
            result.add(new ArrayList<>(solution));
            return;
        }
        
        solution.add(nums[i]);
        backtracking(solution, i+1);
        solution.remove(solution.size()-1);
        backtracking(solution, i+1);
    }


}