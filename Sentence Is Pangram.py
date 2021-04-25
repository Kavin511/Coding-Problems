#  Check if the Sentence Is Pangram
# User Accepted:5320
# User Tried:5413
# Total Accepted:5424
# Total Submissions:6060
# Difficulty:Easy
# A pangram is a sentence where every letter of the English alphabet appears at least once.

# Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

# Example 1:

# Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
# Output: true
# Explanation: sentence contains at least one of every letter of the English alphabet.
# Example 2:

# Input: sentence = "leetcode"
# Output: false
 

# Constraints:

# 1 <= sentence.length <= 1000
# sentence consists of lowercase English letters.
import string
class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
      alpha=set(string.ascii_lowercase)
      return set(sentence.lower())>=alpha
        