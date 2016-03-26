c class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for(int i = 0; i < n; i++) {
            while(j < m + n) {
                if(j > m + i -1) {
                    nums1[j] = nums2[i];
                    j++;
                    break;
                }
                if(nums2[i] >= nums1[j]) {
                    j++;
                    continue;
                }
                else {
                    for(int k = m + i; k > j; k--) {
                        nums1[k] = nums1[k-1];
                    }
                    nums1[j] = nums2[i];
                    j++;
                    break;
                }
            }
        }
    }
}
