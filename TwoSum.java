public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = {-1, -1};
        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(target == nums[i] + nums[j]) {
                    indices[0] = i;
                    indices[1] = j;
                    break;
                }
            }
        }
        return indices;
    }
}
