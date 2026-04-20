# Move Zeroes (LeetCode #283)

Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

**Note** that you must do this in-place without making a copy of the array.

## 📝 Description

**Example 1:**
- **Input:** nums = [0,1,0,3,12]
- **Output:** [1,3,12,0,0]

**Example 2:**
- **Input:** nums = [0]
- **Output:** [0]

**Constraints:**
- `1 <= nums.length <= 10^4`
- `-2^31 <= nums[i] <= 2^31 - 1`

---

## ⚙️ Solution Analysis

**Time Complexity: O(n)**
The array is traversed once. We use a two-pointer approach where one pointer tracks the position of the last non-zero element found.

**Space Complexity: O(1)**
No extra space is used as the swaps are performed directly on the input array.