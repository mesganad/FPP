package list;


public class DoublyLinkedList {
	
		Node header;
		DoublyLinkedList(){
			header = new Node();
		}
		
		//adds to first
		public void addFirst(String item) throws NullPointerException {
			Node newNode=new Node();
			newNode.value=item;
			if(header.next==null) {
				//header<=>newNode->null
				newNode.previous=header;
				newNode.next=null;
				header.next=newNode;
			}
			else{
				//header<=>newNode<=>nextNode
				newNode.next=header.next;
				newNode.previous=header;
				header.next.previous=newNode;
				header.next=newNode;
			}
		}
		//adds to the end of the list
		public void addLast(String item){
			// n is the new node adding at the end
			Node n = new Node();
			// If there is no item in the list, first node will be connected with the header
			if (header.next == null) {
				n.next = null;
				n.previous = header;
				n.value = item;
				header.next = n;
			} else {
				Node temp = header.next;
				// Do the search on last node. 
				while (temp.next != null) {
					temp = temp.next;
				}
				// Add to the end of the list
				n.previous = temp;
				n.next = null;
				n.value = item;
				temp.next = n;
			}
		}
		public boolean remove(String item){
			if(item == null|| item.length() == 0) return false;
			for(Node s= header.next; s != null; s= s.next) {
				if(s.value.equals(item)) {
					if(s.next != null) {
						s.previous.next = s.next;
						s.next.previous = s.previous;
						return true;
					}
					s.previous.next = null;
				    return true;
					
				}
					
			}
			return false;
		}
		public boolean removeFirst() {
			if(header.next==null||header==null) return false;
		    Node cn=header.next;
		    if(cn.next!=null) {
		    	cn.next.previous=header;
		    	header.next=cn.next;
		    	return true;
		    }
		    header.next=null;
		    return true;
		}
		
		public boolean removeLast() throws NullPointerException {
			if(header==null||header.next==null) return false;
				Node lastNode=header.next;
				if(lastNode.next==null) {
					header.next=null;
					return true;
				}
				while(lastNode.next!=null) {
					lastNode=lastNode.next;
				}
				lastNode.previous.next=null;
				lastNode=null;
				return true;
				
		}
				
		@Override
		public String toString() {
			
			StringBuilder sb = new StringBuilder();
			toString(sb, header);
			return sb.toString();
			
		}
		private void toString(StringBuilder sb, Node n) {
			if(n==null) return;
			if(n.value != null) sb.append(" " + n.value);
			toString(sb, n.next);
		}
		
		class Node {
			String value;
			Node next;
			Node previous;
			
			public String toString() {
				return value == null ? "null" : value;
			}
		}
	
		public static void main(String[] args){
			DoublyLinkedList list = new DoublyLinkedList();
			list.addLast("Bob");
			list.addLast("Bill");
			list.addLast(null);
			list.addLast("Carol");
			list.addFirst("Misgan");
			list.addFirst("Asmamaw");
			
			list.removeLast();
			
			System.out.println(list);
			//list.remove("Asmamaw");
			
			System.out.println(list);
			
		}
}
