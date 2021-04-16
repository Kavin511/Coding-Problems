// Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

// You should preserve the original relative order of the nodes in each of the two partitions.

 

// Example 1:


// Input: head = [1,4,3,2,5,2], x = 3
// Output: [1,2,2,4,3,5]
// Example 2:

// Input: head = [2,1], x = 2
// Output: [1,2]
 

// Constraints:

// The number of nodes in the list is in the range [0, 200].
// -100 <= Node.val <= 100
// -200 <= x <= 200


//  Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
 //Solution:
class Solution {
    public ListNode partition(ListNode head, int x) {
      ListNode part1=null,part1Head=null;
      ListNode part2=null,part2Head=null;
      ListNode temp=head;
      if(head==null||head.next==null)
        return head;
      while(temp!=null)
      {
        if(temp.val<x)
        {
          if(part1==null)
          {
            part1=new ListNode(temp.val);
            part1Head=part1;
          }
          else
          {
            part1.next=new ListNode(temp.val);
            part1=part1.next;          
          }
        }
          else
          {
            if(part2==null)
          {
            part2=new ListNode(temp.val);
            part2Head=part2;
          }
          else
          {
            part2.next=new ListNode(temp.val);
            part2=part2.next;          
          }
          }
        temp=temp.next;
        
      }     
      if(part1Head!=null&&part2Head!=null)
      {
        part1.next=part2Head;
        return part1Head;
      }
      else if(part1Head!=null)
      {
        return part1Head;
      }
      else
      {
        return part2Head;
      }
      
   
    }
}