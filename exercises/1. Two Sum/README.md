# Two Sum (LeetCode #1)

Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

You may assume that each input would have exactly one solution, and you may not use the same element twice. You can return the answer in any order.

## 📝 Description

**Example 1:**
- **Input:** nums = [2,7,11,15], target = 9
- **Output:** [0,1]
- **Explanation:** Because nums[0] + nums[1] == 9, we return [0, 1].

**Example 2:**
- **Input:** nums = [3,2,4], target = 6
- **Output:** [1,2]

**Example 3:**
- **Input:** nums = [3,3], target = 6
- **Output:** [0,1]

**Constraints:**
- `2 <= nums.length <= 10^4`
- `-10^9 <= nums[i] <= 10^9`
- `-10^9 <= target <= 10^9`
- `Only one valid answer exists.`

---

## ⚙️ Solution Analysis

**Time Complexity: O(n)**
We traverse the list containing n elements only once. Since the loop runs at most n times, the overall time complexity is linear.

**Space Complexity: O(n)**
The extra space required depends on the number of items stored in the hash map, which stores at most n elements (one entry for each number in the array). In the worst case scenario, where the two numbers that sum up to the target are at the very end, we will have nearly every element of the array stored in the map.