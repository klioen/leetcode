public class Solution {
    public int binarySearch(int[] nums, int left, int right, int target) {
        while(left <= right) {
            int mid = (left + right) / 2;
            if(target < nums[mid])
                right = mid - 1;
            else if(target > nums[mid])
                left = left + 1;
            else
                return mid;
        }
        return -1;
    }
    public int[] searchRange(int[] nums, int target) {
        int pos = binarySearch(nums, 0, nums.length - 1, target);
        int[] result = {-1, -1};
        if(pos >= 0) {
            int l = pos;
            int r = pos;
            do {
                result[0] = l;
                l = binarySearch(nums, 0, l-1, target);
            } while(l >= 0);
            do {
                result[1] = r;
                r = binarySearch(nums, r+1, nums.length - 1, target);
            } while(r >= 0);   
        }
        return result;
    }
}
