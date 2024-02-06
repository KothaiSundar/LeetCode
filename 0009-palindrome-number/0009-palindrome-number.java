class Solution {
      public boolean isPalindrome(int x) {
        if (x < 0) {
            return false; // Negat
        }
              String str = Integer.toString(x);  
        int length = str.length();
        int temp = x, remainder = 0, sum = 0;
     

        for (int i = 0; i < length; i++) {
            remainder = temp % 10;
            sum = (sum * 10) + remainder;
            temp = temp / 10;
        }

        if (sum == x)
            return true;
        else
            return false;
    }

}