# Valid Anagram (LeetCode #242)

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

## 📝 Description
**Example 1:**
Input: s = "anagram", t = "nagaram"
Output: true

**Example 2:**
Input: s = "rat", t = "car"
Output: false

**Constraints:**
- `1 <= s.length, t.length <= 5 * 10^4`
- `s and t consist of lowercase English letters.`

---

## ⚙️ Solution Analysis

**Time Complexity: O(n)**
The algorithm iterates through the first string to populate the map and then through the second string to decrement counts. 
Since both operations are linear and n represents the length of the strings, the total time complexity is O(n).

**Space Complexity: O(1)**
While the space complexity is technically proportional to the character set size, since we are dealing with a fixed alphabet (lowercase English letters), the space complexity is effectively O(1) because the hash map size is capped by a constant.