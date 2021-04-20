package problem2;

public class LinkStack implements Stack1 {

	private Node top;
	private int size;

	public LinkStack() {
		top = new Node(null);
	}

	private class Node {
		Node next;
		String val;

		private Node(String val) {
			this.val = val;
		}

	}

	@Override
	public void push(String item) {
		var newNode = new Node(item);
		if (top == null) {
			top = newNode;
			newNode.next = null;
		}
		newNode.next = top;
		top = newNode;
		size++;
	}

	@Override
	public String pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty!");
			return null;
		}

		String poppedElement = top.val;
		top = top.next;
		size--;
		return poppedElement;
	}

	@Override
	public String peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty!");
			return null;
		}
		return top.val;
	}

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		toString(sb, top);
		return sb.toString();

	}

	private void toString(StringBuilder sb, Node n) {
		if (n == null)
			return;
		if (n.val != null)
			sb.append(" " + n.val);
		toString(sb, n.next);
	}
}
