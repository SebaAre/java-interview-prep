# Longest Common Prefix (LeetCode #14)

Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string `""`.

## 📝 Description

**Example 1:**
- **Input:** strs = ["flower","flow","flight"]
- **Output:** "fl"

**Example 2:**
- **Input:** strs = ["dog","racecar","car"]
- **Output:** ""

**Constraints:**
- `1 <= strs.length <= 200`
- `0 <= strs[i].length <= 200`
- `strs[i]` consists of only lowercase English letters.

---

## ⚙️ Solution Analysis

**Time Complexity: O(n * m)**
Where **n** is the number of strings in the array and **m** is the length of the first string (the initial prefix).

**Space Complexity: O(1)**
We only use a constant amount of extra space. The `prefix` variable points to a substring, and we don't use any additional data structures that grow with the input size.
