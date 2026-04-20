class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int lastNumberOfM = m-1;
        int lastNumberOfN = n-1;
        int lastNumberOfFinalArray = m + n - 1;
        

        while (lastNumberOfN >= 0){
            if (lastNumberOfM >= 0 && nums1[lastNumberOfM] > nums2[lastNumberOfN]){
                nums1[lastNumberOfFinalArray] = nums1[lastNumberOfM];
                lastNumberOfM--;
                lastNumberOfFinalArray--;
            } else {
                nums1[lastNumberOfFinalArray] = nums2[lastNumberOfN];
                lastNumberOfN--;
                lastNumberOfFinalArray--;
            }
        }

    }
}