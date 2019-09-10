package LinkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

//import LinkedList.Node;

public class LinkedList {
		
	public class Node {
		int data;
		Node next;
	}
	
		// TODO Auto-generated method stub
		Node head;
		
		public void insert(int data) {
			Node node =new Node();
			node.data=data;
			if(head==null) {
				head=node;
			}
			else {
				Node n=head;
				while(n.next!=null) {
					n=n.next;
				}
				n.next=node;
			}
		}
		
		public void show() {
			//StringBuffer buf=new StringBuffer();
			ArrayList<String>a=new ArrayList<>();
			
			
			Node node=head;
			while(node.next!=null) {
				System.out.println(node.data);
				node=node.next;
			}
			System.out.println(node.data);
		}
		
		public void addStart(int data) {
			Node node=new Node();
			node.data=data;
			node.next=head;
			head=node;
			
		}
		
		public void insertAt(int data, int index) {
			Node node=new Node();
			node.data=data;
			
			if(index==0)addStart(data);
			else {
			Node n=head;
			for(int i=0;i<index-1;i++) {
				n=n.next;
			}
			
			node.next=n.next;
			n.next=node;
		}
		}
		
		public void removeAt(int index) {
			if(index==0) {
				head=head.next;
			}
			else {
			Node n =head;
			Node n1=null;
			for(int i=0;i<index-1;i++) {
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
			}
		}
		
		public void removeAll(int data) {
			HashSet<Node>h=new HashSet<Node>();
			
			while(head!=null) {
			if(head.data==data) {
				head=head.next;
			}
			else {
				break;
			}
			}
			//Node n=new Node();
			Node n =head;
			Node n1=null;
			System.out.println("head"+n.data);
			while(n.next!=null) {
				if(n.next.data==data) {
					n1=n.next;
					n.next=n1.next;
			}
				else {
					n=n.next;
				}
		
			}
		}
		
		public void reverse() {
			Node n=head;
			
			ArrayList<Integer> l=new ArrayList<Integer>();
			if(n==null)System.out.println("null");
			while(n.next!=null) {
				l.add(n.data);
				n=n.next;
			}
			l.add(n.data);
			Collections.reverse(l);
			System.out.println("l"+l);
			Node node=new Node();
			node.data=l.get(0);
			head=node;
			for(int i=1;i<l.size();i++) {
				Node newNode= new Node();
				newNode.data=l.get(i);
				node.next=newNode;
				node=newNode;				
				
			}
			
		}
		
		public void isPalindrome() {
			Node n=head;
			
			ArrayList<Integer> l=new ArrayList<Integer>();
			if(n==null)System.out.println("null");
			while(n.next!=null) {
				l.add(n.data);
				n=n.next;
			}
			l.add(n.data);
			ArrayList<Integer> l1=new ArrayList<Integer>(l);
			Collections.reverse(l);
			if(l.equals(l1)) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
		
		public void findMiddle() {
			Node n=head;
			
			ArrayList<Integer> l=new ArrayList<Integer>();
			if(n==null)System.out.println("null");
			while(n.next!=null) {
				l.add(n.data);
				n=n.next;
			}
			l.add(n.data);
			ArrayList<Integer> l1=new ArrayList<Integer>(l);
			int k=l.size()/2;
			n=head;
			for(int i=0;i<k;i++) {
				n=n.next;
			}
			System.out.println(n.data);
			
		}
	

}
