package BrowserHistoryNavigation;

public class BrowserHistoryNavigation extends Navigation {
	class Node{
		Node prev,next;
		String data;
		Node(String data){
			this.data=data;
		}
	}
	
	private Node pointer;
	
	public void search(String value) {
		Node newNode=new Node(value);
		if(pointer==null) {
			pointer=newNode;
			return;
		}
		Node temp=pointer;
		pointer=newNode;
		temp.next=pointer;
		pointer.prev=temp;
	}

	String getPointerValue() {
		return pointer.data;
	}
	
	@Override
	String backward() {
		// TODO Auto-generated method stub
		if(pointer==null)
			return "Browser History is Empty";
		else if(pointer.prev==null)
			return "No more past History";
		pointer=pointer.prev;
		return getPointerValue();
	}

	@Override
	String forward() {
		// TODO Auto-generated method stub
		if(pointer==null)
			return "Browser History is Empty";
		else if(pointer.next==null)
			return "No more forward History";
		pointer=pointer.next;
		return getPointerValue();
	}
	
}
