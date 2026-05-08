# Ransom Note (LeetCode #383)

Given two strings `ransomNote` and `magazine`, return `true` if `ransomNote` can be constructed using the letters from `magazine` and `false` otherwise.

## 📝 Description

Each letter in `magazine` can only be used once in `ransomNote`.

**Example 1:**
- **Input:** `ransomNote = "a", magazine = "b"`
- **Output:** `false`

**Example 2:**
- **Input:** `ransomNote = "aa", magazine = "ab"`
- **Output:** `false`

**Example 3:**
- **Input:** `ransomNote = "aa", magazine = "aab"`
- **Output:** `true`

**Constraints:**
- `1 <= ransomNote.length, magazine.length <= 10^5`
- Strings consist of lowercase English letters.

---

## ⚙️ Solution Analysis

**Time Complexity: O(n + m)**
Where **n** is the length of `ransomNote` and **m** is the length of `magazine`. We iterate through each string once.

**Space Complexity: O(1)**
Since the input only contains lowercase English letters, we use a fixed-size integer array of length 26 to store character counts. This is considered constant space.

---