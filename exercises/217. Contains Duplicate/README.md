# Contains Duplicate (LeetCode #217)

Given an integer array `nums`, return `true` if any value appears **at least twice** in the array, and return `false` if every element is distinct.

## 📝 Description

**Example 1:**
- **Input:** nums = [1,2,3,1]
- **Output:** true

**Example 2:**
- **Input:** nums = [1,2,3,4]
- **Output:** false

**Example 3:**
- **Input:** nums = [1,1,1,3,3,4,3,2,4,2]
- **Output:** true

**Constraints:**
- `1 <= nums.length <= 10^5`
- `-10^9 <= nums[i] <= 10^9`

---

## ⚙️ Solution Analysis

**Time Complexity: O(n)**
We iterate through the array once. Each `HashSet` lookup and insertion operation takes constant time $O(1)$.

**Space Complexity: O(n)**
In the worst case (where all elements are unique), we store all $n$ elements of the array in the `HashSet`.

---