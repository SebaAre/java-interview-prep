# Remove Duplicates from Sorted Array (LeetCode #26)

Given an integer array `nums` sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in `nums`.

## 📝 Description

**Example 1:**
- **Input:** nums = [1,1,2]
- **Output:** 2, nums = [1,2,_]

**Example 2:**
- **Input:** nums = [0,0,1,1,1,2,2,3,3,4]
- **Output:** 5, nums = [0,1,2,3,4,_,_,_,_,_]

**Constraints:**
- `1 <= nums.length <= 3 * 10^4`
- `-100 <= nums[i] <= 100`
- `nums` is sorted in non-decreasing order.

---

## ⚙️ Solution Analysis

**Time Complexity: O(n)**
We use a single pass through the array with two pointers. Each element is visited exactly once.

**Space Complexity: O(1)**
The modification is done in-place without using any additional data structures like Sets or Lists.