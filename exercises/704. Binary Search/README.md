# Binary Search (LeetCode #704)

Given an array of integers `nums` sorted in ascending order, and an integer `target`, write a function to search `target` in `nums`.

## 📝 Description

If `target` exists, then return its index. Otherwise, return `-1`. You must write an algorithm with **O(log n)** runtime complexity.

**Example:**
- **Input:** `nums = [-1,0,3,5,9,12], target = 9`
- **Output:** `4`
- **Explanation:** 9 exists in nums and its index is 4.

---

## ⚙️ Solution Analysis

**Time Complexity: O(log n)**
By halving the search space in each iteration, the algorithm reaches the target in logarithmic time.

**Space Complexity: O(1)**
We only use a few pointer variables (`left`, `right`, `mid`), regardless of the input size.