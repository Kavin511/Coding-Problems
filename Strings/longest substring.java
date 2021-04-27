// Given a string s, find the length of the longest substring without repeating characters.

 

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
// Example 4:

// Input: s = ""
// Output: 0
 

// Constraints:

// 0 <= s.length <= 5 * 104
// s consists of English letters, digits, symbols and spaces.
// Solution 1:
class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] words = s.toCharArray();
        if (s.length() <= 1) {
            return s.length();
        }
        
        int max = 1;
        int start = 0;
        
        for (int end = 1; end < s.length(); end++) {
            for (int i = start; i < end; i++) {
                if (words[i] == words[end]) {
                    start = i + 1;
                    break;
                }
            }
            max = Math.max(max, end - start + 1);
        }
        
        return max;
    }
}

// Solution 2:
class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int temp=0;
        for(int i=0;i<s.length();i++)
        {            
            int alpha[]=new int[127];
            for(int j=i;j<s.length();j++)
            {             
                if(alpha[s.charAt(j)]==0)
                {
                    temp++;
                    alpha[s.charAt(j)]=1;     
                    max=max<temp?temp:max;
                }
                else
                {                                        
                                 
                    break;
                }
                
            } 
            temp=0;        
        }                       
        return max;
    }
}
