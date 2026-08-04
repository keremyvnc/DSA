class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        output[0]=1;
        int prefix=1;
        for(int i=0;i<nums.length;i++){
            output[i]=prefix;
            prefix = prefix * nums[i];
        }
        int suffix=1;
        for(int i=nums.length-1;i>=0;i--){
            output[i] = suffix * output[i];
            suffix = suffix * nums[i];
        }

        return output;
    }
}