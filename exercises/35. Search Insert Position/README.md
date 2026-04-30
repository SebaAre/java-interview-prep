# Search Insert Position (LeetCode #35)

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

## 📝 Description

**Example 1:**
- **Input:** nums = [1,3,5,6], target = 5
- **Output:** 2

**Example 2:**
- **Input:** nums = [1,3,5,6], target = 2
- **Output:** 1

**Example 3:**
- **Input:** nums = [1,3,5,6], target = 7
- **Output:** 4

**Constraints:**
- `1 <= nums.length <= 10^4`
- `-10^4 <= nums[i] <= 10^4`
- `nums` contains distinct values sorted in ascending order.
- `-10^4 <= target <= 10^4`

---

## ⚙️ Solution Analysis

**Time Complexity: O(log n)**
By using Binary Search, we divide the search space in half during each iteration, making it significantly faster than a linear search for large datasets.

**Space Complexity: O(1)**
The algorithm only uses a constant amount of extra space for the pointers (`low`, `high`, `mid`).