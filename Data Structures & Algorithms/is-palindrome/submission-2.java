class Solution {
    public boolean palindrome(StringBuilder s1)
    {
        int r = s1.length() - 1;
        int l = 0;
        while (l < r )
        {
            if( s1.charAt(l) != s1.charAt(r))
            return false;
            l++;
            r--;
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        int n = s.length();
        StringBuilder s1 = new StringBuilder();
        for( int i = 0; i < n; i++)
        {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                s1.append(Character.toLowerCase(ch));
            }
        }
        return palindrome(s1);
    }
}
