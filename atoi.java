// Your task  is to implement the function atoi. The function takes a string(str) as argument and converts it to an integer and returns it.

// Example 1:

// Input:
// str = 123
// Output: 123

// Example 2:

// Input:
// str = 21a
// Output: -1
// Explanation: Output is -1 as all
// characters are not digit only.
// Your Task:
// Complete the function atoi() which takes a string as input parameter and returns integer value of it. if the input string is not a numerical string then returns 1..

// Expected Time Complexity: O(|S|), |S| = length of string S.
// Expected Auxiliary Space: O(1)

// Constraints:
// 1<=length of S<=10
// Solution 1:
class Solution
{
    int atoi(String str)
    {
        boolean flag=true;
	for(int i=0;i<str.length();i++)
	{
	    if(i==0&&str.charAt(i)=='-')
	    continue;
	    if(!Character.isDigit(str.charAt(i)))
	    {
	        flag=false;
	        break;
	    }
	}
	if(flag)
	return Integer.parseInt(str);
	else
	return -1;
    }
}