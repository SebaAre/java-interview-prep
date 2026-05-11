# Product of Array Except Self (LeetCode #238)

Given an integer array `nums`, return an array `answer` such that `answer[i]` is equal to the product of all the elements of `nums` except `nums[i]`.

## 📝 Description

The algorithm must run in **O(n)** time and without using the division operation.

**Example 1:**
- **Input:** `nums = [1, 2, 3, 4]`
- **Output:** `[24, 12, 8, 6]`
- **Explanation:** - `answer[0] = 2 * 3 * 4 = 24`
  - `answer[1] = 1 * 3 * 4 = 12`
  - `answer[2] = 1 * 2 * 4 = 8`
  - `answer[3] = 1 * 2 * 3 = 6`

**Constraints:**
- `2 <= nums.length <= 10^5`
- The product of any prefix or suffix of `nums` is guaranteed to fit in a 32-bit integer.

---

## ⚙️ Solution Analysis

**Time Complexity: O(n)**
We traverse the array three times: once for the left products, once for the right products, and once to combine them. This results in $3n$ operations, which simplifies to $O(n)$.

**Space Complexity: O(n)**
We are using two auxiliary arrays (`left` and `right`) to store the prefix and suffix products.

---