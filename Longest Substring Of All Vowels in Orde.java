//  Longest Substring Of All Vowels in Order
// Medium

// 64

// 5

// Add to List

// Share
// A string is considered beautiful if it satisfies the following conditions:

// Each of the 5 English vowels ('a', 'e', 'i', 'o', 'u') must appear at least once in it.
// The letters must be sorted in alphabetical order (i.e. all 'a's before 'e's, all 'e's before 'i's, etc.).
// For example, strings "aeiou" and "aaaaaaeiiiioou" are considered beautiful, but "uaeio", "aeoiu", and "aaaeeeooo" are not beautiful.

// Given a string word consisting of English vowels, return the length of the longest beautiful substring of word. If no such substring exists, return 0.

// A substring is a contiguous sequence of characters in a string.

 

// Example 1:

// Input: word = "aeiaaioaaaaeiiiiouuuooaauuaeiu"
// Output: 13
// Explanation: The longest beautiful substring in word is "aaaaeiiiiouuu" of length 13.
// Example 2:

// Input: word = "aeeeiiiioooauuuaeiou"
// Output: 5
// Explanation: The longest beautiful substring in word is "aeiou" of length 5.
// Example 3:

// Input: word = "a"
// Output: 0
// Explanation: There is no beautiful substring, so return 0.
 


class Solution {
    public int longestBeautifulSubstring(String word) {
      int len=0,vCount=1,max=0;
     for(int i=0;i<word.length();i++)
     {
       if(i!=0&&word.charAt(i)<word.charAt(i-1))
       {
         len=0;
         vCount=0;
       }
       len++;
       if(i!=0&&(word.charAt(i)!=word.charAt(i-1)))vCount++;
       if(vCount==5)max=Math.max(len,max);
     }
      return max;
    }
}