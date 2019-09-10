import org.w3c.dom.Node;

public class Question{
    private class Node{
    	
    	int val;
    	Node next;
    	Node(int x){
    		val=x;
    	}
    }
    

    public Node joinLinkedList(Node h1, Node h2){
        if(h1==null && h2==null)return null;
        if(h1==null)return h2;
        if(h2==null)return h1;
        
        Node n1=h1;
        Node n2=h2;
        Node head=h1;
        //should have used 2 node pointers for 2 linked lists and then we can use temporary pointers
        //to keep alternating the 2 lists and flipping the values.
        
        while(n1.next!=null||n2.next!=null){
          Node temp1=n1.next;
          Node temp2=n2.next;
          	n2.next=temp1;// 5 7 17
            n1.next=n2;	  // |/			12 points to 7 first, and then 5 points to 12
            			  // 12 10 2
            //h1=h1.next;
            n1=temp1;
            n2=temp2;
        }
        
        return head;
        
    }
    
    }
    