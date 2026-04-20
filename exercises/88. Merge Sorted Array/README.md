# Merge Sorted Array (LeetCode #88)

You are given two integer arrays `nums1` and `nums2`, sorted in non-decreasing order, and two integers `m` and `n`, representing the number of elements in `nums1` and `nums2` respectively.

Merge `nums2` into `nums1` as one single array sorted in non-decreasing order.

## 📝 Description

**Example 1:**
- **Input:** nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
- **Output:** [1,2,2,3,5,6]

**Constraints:**
- `nums1.length == m + n`
- `nums2.length == n`
- `0 <= m, n <= 200`
- `1 <= m + n <= 200`

---

## ⚙️ Solution Analysis

**Time Complexity: O(m + n)**
The algorithm compares elements from both arrays starting from the end and places the larger one in the last available position of `nums1`. This ensures we touch each element at most once.

**Space Complexity: O(1)**
The merge is performed **in-place** within `nums1`. No additional data structures or memory allocations are required