# Length of Last Word (LeetCode #58)

Given a string `s` consisting of words and spaces, return the length of the **last** word in the string. 

A **word** is a maximal substring consisting of non-space characters only.

## 📝 Description

**Example 1:**
- **Input:** s = "Hello World"
- **Output:** 5

**Example 2:**
- **Input:** s = "   fly me   to   the moon  "
- **Output:** 4

**Constraints:**
- `1 <= s.length <= 10^4`
- `s` consists of only English letters and spaces `' '`.
- There will be at least one word in `s`.

---

## ⚙️ Solution Analysis

**Time Complexity: O(n)**
The algorithm processes the string starting from the end. In the worst case, it traverses all characters once, resulting in linear time complexity.

**Space Complexity: O(1)**
The operation is performed **in-place** using simple pointers. No additional data structures are required, maintaining constant space complexity.