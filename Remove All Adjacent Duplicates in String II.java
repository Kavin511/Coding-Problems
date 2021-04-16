Given a string s, a k duplicate removal consists of choosing k adjacent and equal letters from s and removing them causing the left and the right side of the deleted substring to concatenate together.

We repeatedly make k duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made.

It is guaranteed that the answer is unique.

 

Example 1:

Input: s = "abcd", k = 2
Output: "abcd"
Explanation: There's nothing to delete.
Example 2:

Input: s = "deeedbbcccbdaa", k = 3
Output: "aa"
Explanation: 
First delete "eee" and "ccc", get "ddbbbdaa"
Then delete "bbb", get "dddaa"
Finally delete "ddd", get "aa"
Example 3:

Input: s = "pbbcggttciiippooaais", k = 2
Output: "ps"
solution 1:
class Solution {
    public String removeDuplicates(String s, int k) {
        int len = s.length();
        if(len < k) return s;
        Deque<Node> stack = new ArrayDeque<>();
        char[] arr = s.toCharArray();
        for(char c : arr){
            if(stack.isEmpty() || c != stack.peek().ch){
                stack.push(new Node(c));
                
            }else{
                int time = stack.peek().time;
                if(time +1 == k){
                    stack.pop();
                }else{
                   stack.peek().time++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            Node node = stack.pop();
            int time = node.time;
            for(int i=0; i<time; ++i){
                sb.append(node.ch);
            }
        }        
        return sb.reverse().toString();
    }
}

class Node{
    char ch;
    int time;
    
    public Node(char c){
        this.ch = c;
        this.time =1;
    }
}
solution 2:
class Solution {
    public String removeDuplicates(String s, int k) {
         int cnt = 1;
        char last = s.charAt(0);
        for(int i=1;i<s.length();i++){
            char cur = s.charAt(i);
            if(cur==last){
                cnt++;
            }else{
                cnt = 1;
                last = cur;
            }
            
            if(cnt == k)
                return removeDuplicates(s.substring(0,i-k+1)+s.substring(i+1),k);
        }
        return s;
    }
}
solution 3:
class Solution {
    public String removeDuplicates(String sb, int k) {
      StringBuilder s=new StringBuilder(sb);
      for(int i=0;i<s.length();)
      {
        int arr[]=new int[26];
        for(int j=i,j1=i+k-1<s.length()?i+k-1:i-1;j<=j1;j++,j1--)
        {
         if(s.charAt(j)-'a'!=s.charAt(j1)-'a') 
         {
           break;
         } 
          arr[s.charAt(j)-'a']++;
          arr[s.charAt(j1)-'a']++;
          if(j==j1)
            arr[s.charAt(j1)-'a']--;
        }        
        if(arr[s.charAt(i)-'a']==k)
        {
          s.delete(i,i+k);
          if(i>0&&i<s.length()-1)
          {
            if(s.charAt(i)==s.charAt(i-1))
            {
              i-=k;
              if(i<0)
                i=0;
            }
            else if(!(s.charAt(i)==s.charAt(i+1)))
              i++;
          }
                  
        }
        else
          i++;        
      }
      return s.toString();
    }
}