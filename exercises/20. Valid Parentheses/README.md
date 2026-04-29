# Valid Parentheses (LeetCode #20)

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'\['` and `']'`, determine if the input string is valid.

An input string is valid if:

1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.

## 📝 Description

**Example 1:**

* **Input:** s = "()"
* **Output:** true

**Example 2:**

* **Input:** s = "()\[]{}"
* **Output:** true

**Example 3:**

* **Input:** s = "(]"
* **Output:** false

**Constraints:**

* `1 <= s.length <= 10^4`
* `s` consists of parentheses only `'()\[]{}'`.

\---

## ⚙️ Solution Analysis

**Time Complexity: O(n)**
The algorithm traverses the string exactly once. Each character is pushed onto or popped from the stack at most once, resulting in linear time complexity relative to the string length.

**Space Complexity: O(n)**
In the worst case (e.g., a string consisting only of opening brackets), the stack will store all `n` characters of the string, leading to linear space complexity.

\---

