class Solution {
    // keremyvnc
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int count = 0;
        int sortedElement = nums[0];
        for(int i=0; i<nums.length; i++) {
            if(sortedElement == nums[i]){
                count++;
                if(count <= 2) {
                    if(nums[k]<nums[i]){
                        int temp = nums[i]; // swap i and k indexes
                        nums[i] = nums[k];
                        nums[k] = temp;
                    }
                    k++;
                }
            }
            else if(nums[i] > sortedElement){
                sortedElement = nums[i];
                count=1;
                int temp = nums[i]; // swap i and k indexes
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
            }
        }
        return k;
    }
}