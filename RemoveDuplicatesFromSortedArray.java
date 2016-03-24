c class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int length = nums.length;
        int j = 0;
        if(length == 0)
            return 0;
        if(length == 1)
            return 1;
        for(int i=1; i < length; i++) {
            if(nums[i] != nums[i-1]) {
                count++;
                j++;
                nums[j] = nums[i];
            }
        }
        return count;
    }
}
