# Number of Senior Citizens (LeetCode #2678)

You are given a **0-indexed** array of strings `details`, where each element represents passenger information compressed into a 15-character string.

## 📝 Description

**Example 1:**
- **Input:** `details = ["7868190130M7522","5303914400F9211","9273338290F4010"]`
- **Output:** `2`
- **Explanation:** The ages are 75, 92, and 40. Two passengers are over 60.

**Example 2:**
- **Input:** `details = ["1313579440F2036","2921522980M5644"]`
- **Output:** `0`

**Constraints:**
- `1 <= details.length <= 100`
- `details[i].length == 15`
- `details[i][11..12]` represents the age.

---

## ⚙️ Solution Analysis

**Time Complexity: O(n)**
Where **n** is the number of strings in the array. We perform a single pass through the list

**Space Complexity: O(1)**
We only use a few integer variables (counter and age) regardless of the input size.