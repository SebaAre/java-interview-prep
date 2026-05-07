# Container With Most Water (LeetCode #11)

Find two lines that together with the x-axis form a container, such that the container contains the most water.

## 📝 Description

**Example 1:**
- **Input:** height = [1,8,6,2,5,4,8,3,7]
- **Output:** 49
- **Explanation:** The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water the container can contain is 49.

**Constraints:**
- `n == height.length`
- `2 <= n <= 10^5`
- `0 <= height[i] <= 10^4`

---

## ⚙️ Solution Analysis

**Time Complexity: O(n)**
We use a two-pointer approach that starts from both ends and moves toward the center. Each element is visited at most once, resulting in linear time complexity.

**Space Complexity: O(1)**
We only use a few integer variables (`left`, `right`, `maxArea`, etc.) regardless of the size of the input array.