class Solution {
    public String longestCommonPrefix(String[] strs) {
         if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Iterate through characters of the first string
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            
            // Check if the character is present in the same position for all other strings
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    // If not present or not matching, return the prefix up to this point
                    return strs[0].substring(0, i);
                }
            }
        }
        
        // If all strings have been iterated through and no mismatch found, return the first string
        return strs[0];
        
    }
}