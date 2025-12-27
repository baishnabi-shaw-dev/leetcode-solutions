class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // pointer for nums1 (last valid element)
        int j = n - 1; // pointer for nums2
        int k = m + n - 1; // pointer for merged array (end of nums1)

        while (j >= 0) { // while there are still elements in nums2
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        // nums1 now contains the merged result
    }

    // Example test
    public static void main(String[] args) {
        MergeSortedArray s = new MergeSortedArray();
        int[] nums1 = { 1, 3, 5, 7, 0, 0, 0 };
        int[] nums2 = { 2, 4, 6 };
        s.merge(nums1, 4, nums2, 3);
        for (int x : nums1)
            System.out.print(x + " ");
        // Output: 1 2 3 4 5 6 7 
    }
}