package MusicPlayer;

public class LinkedList implements Queue {
	class Node{
		String song;
		Node next;
		Node(String song){
			this.song=song;
		}
	}
	
	Node head,tail,curr;
	
	@Override
	public String currentSong() {
		return ("Playing "+curr.song);
	}
	
	@Override
	public String playNext() {
		if(curr.next==null)
			return "No more songs available in the plalist";
		curr=curr.next;
		return "Playing "+curr.song;
	}
	
	
	
	@Override
	public void addFirst(String song) {
		Node newNode=new Node(song);
		if(head==null) {
			addLast(song);
			return;
		}
		newNode.next=head;
		if(curr==head)
			curr=newNode;
		head=newNode;
	}
	
	@Override
	public void removeFirst() {
		if(head==null) {
			System.out.println("playlist is empty.");
			return;
		}
		if(curr==head) {
			head=head.next;
			curr=head;
			return;
		}
		head=head.next;			
	}
	
	@Override
	public void removeLast() {
		Node temp=head;
		while(temp.next==tail) {
			temp=temp.next;
		}
		if(curr==tail)
			curr=temp;
		temp.next=null;
	}
	
	@Override
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.song);
			temp=temp.next;
		}
	}

	@Override
	public void addLast(String song) {
		// TODO Auto-generated method stub
		Node newNode=new Node(song);
		if(head==null) {
			head=newNode;tail=head;
			curr=head;
			return;
		}
		tail.next=newNode;
		tail=tail.next;
	}
}
