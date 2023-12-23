package LinkedList;

 // Definition for singly-linked list.
  class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }

class Solution {
    public ListNode reverseList(ListNode A) {
        ListNode curr=A;
        ListNode next=null;
        ListNode prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
public class ReverseLL {

    public static void main(String[] args) {
        ListNode head=null;
        ListNode nn=new ListNode(2);
        head=nn;
        ListNode nn2=new ListNode(3);
        ListNode nn3=new ListNode(4);
        head.next=nn2;
        head.next.next=nn3;

            Solution obj=new Solution();
        ListNode ans=obj.reverseList(head);
        ListNode temp=ans;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }

    }
}
