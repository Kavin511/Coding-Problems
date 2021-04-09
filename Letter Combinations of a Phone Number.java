Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.



 

Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:

Input: digits = ""
Output: []
Example 3:

Input: digits = "2"
Output: ["a","b","c"]
 

Constraints:

0 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9'].

Solution1:
class Solution {
    List<String> combinations=new ArrayList<String>();
    String charSet="";
    String arr[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
      if(digits.length()==0)
        return combinations;      
      charSet=digits; 
      letterCombinations(0,new StringBuilder());
      return combinations;
    }
    void letterCombinations(int index,StringBuilder path)
    {
      if(path.length()==charSet.length())
      {
        combinations.add(path.toString());
        return ;
      }     
      String possibleCombo=arr[charSet.charAt(index)-'0'];  
      for(char letter:possibleCombo.toCharArray())
      {
        path.append(letter);
        letterCombinations(index+1,path);
        path.deleteCharAt(index);
      }    
    }
}