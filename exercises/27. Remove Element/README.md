# Remove Element (LeetCode #27)

Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in `nums` in-place. The order of the elements may be changed. Then return the number of elements in `nums` which are not equal to `val`.

## 📝 Description

**Example 1:**
- **Input:** nums = [3,2,2,3], val = 3
- **Output:** 2, nums = [2,2,_,_]

**Constraints:**
- `0 <= nums.length <= 100`
- `0 <= nums[i] <= 50`
- `0 <= val <= 100`

---

## ⚙️ Solution Analysis

**Time Complexity: O(n)**
We traverse the array only once, making the time complexity linear relative to the number of elements.

**Space Complexity: O(1)**
The algorithm is highly efficient in terms of memory because it performs the operations in-place, without requiring any additional data structures regardless of the input size.