package LinkedList;

public class ReverseLLPart {
    class Node{
        int val;
        Node next;

        Node(int value){
            val=value;
            next=null;
        }
    }
    static Node head=null;
    public static void main(String[] args) {

        ReverseLLPart obj=new ReverseLLPart();
        obj.insert();
        int reverseStart=1;
        int reverseEnd=2;
        obj.reversePart(head,reverseStart,reverseEnd);

    }
    public void reversePart(Node Head,int reverseStart,int reverseEnd){
        //input: 1 2 3 4 5
        //start : 2 ,end : 4
        //output: 1 4 3 2 5
        Node prev=null;
        Node temp=Head;
       
        for(int i=1;i<reverseStart;i++){
            prev=temp;
            temp=temp.next;
        }

        Node curr=temp;
        Node lastNode=null;
        for(int i=1;i<=(reverseEnd-reverseStart+1);i++){
            Node next=curr.next;
            curr.next=lastNode;
            lastNode=curr;
            curr=next;
        }
        temp.next=curr;
        //1 2 3 4 5
        // 4 3 2(temp) .next =


        if(prev!=null){
            prev.next=lastNode;
        }else{
            prev=lastNode;
            head=prev;
        }

         temp=head;
         while(temp.next!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
         }
         System.out.println(temp.val);


    }

    public void insert(){
        Node nn=new Node(1);
        head=nn;

        Node nn2=new Node(2);
        nn.next=nn2;
        Node nn3=new Node(3);
        nn2.next=nn3;
        Node nn4=new Node(4);
        nn3.next=nn4;
        Node nn5=new Node(5);
        nn4.next=nn5;
    }
}
