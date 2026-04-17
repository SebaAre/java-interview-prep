class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> countWords = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            countWords.put(c, countWords.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!countWords.containsKey(c)) {
                return false;
            }
            
            countWords.put(c, countWords.get(c) - 1);
            
            if (countWords.get(c) == 0) {
                countWords.remove(c);
            }
        }
        
        return countWords.isEmpty();
    }
}