class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> nums;
    public List<List<Integer>> subsets(int[] nums) {
        this.nums = Arrays.stream(nums).boxed().toList();
        backtracking(new ArrayList<>(), 0);
        return result;
    }

    void backtracking(List<Integer> solution, int i) {
        if(i==nums.size()){
            result.add(new ArrayList<>(solution));
            return;
        }
        
        solution.add(nums.get(i));
        backtracking(solution, i+1);
        solution.remove(solution.size()-1);
        backtracking(solution, i+1);
    }


}