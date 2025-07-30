package Collections.ListInterface;
import java.util.*;
class LinkedList{
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	
	Node head,tail;
	
	public void addElement(int val) {
		Node nn=new Node(val);
		if(head==null) {
			head=nn;
			tail=head;
		}
		tail.next=nn;
		tail=nn;
	}
	
	public void reverse() {
		Node prev=null,curr=head;
		while(curr!=null) {
			Node temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		head=prev;
	}
	
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}

public class ReverseList {
	public static void reverseArrayList(List<Integer> list) {
		int start=0,end=list.size()-1;
		while(start<end) {
			swap(list,start,end);
			start++;end--;
		}
	}
	public static void swap(List<Integer> list,int i, int j) {
		int a=list.get(i);
		list.set(i,list.get(j));
		list.set(j, a);
	}
	public static void main(String args[]) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		reverseArrayList(list);
		System.out.println(list);
		System.out.println("*****************");
		LinkedList l=new LinkedList();
		l.addElement(1);
		l.addElement(2);
		l.addElement(3);
		l.addElement(4);
		System.out.println("Before Reverse: ");
		l.display();
		System.out.println("After Reverse: ");
		l.reverse();
		l.display();
	}
}
