class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        int h = haystack.length();
        
        for (int i = 0; i <= h - n; i++)
        {
            boolean found = true;
            for (int j = 0; j < n; j++)
            {
                if (needle.charAt(j) != haystack.charAt(i + j))
                {
                    found = false;
                    break;
                }
            }
            
            if (found)
            {
                return i;
            }
        }
        
        return -1;
    }
}
