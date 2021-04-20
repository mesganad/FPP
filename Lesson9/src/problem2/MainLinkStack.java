package problem2;

public class MainLinkStack {

	public static void main(String[] args) {


		LinkStack linkedStack=new LinkStack();
		System.out.println(linkedStack.pop());
		linkedStack.push("Mekelle");
		linkedStack.push("Bahirdar");
		linkedStack.push("Addis Aaba");
		
		System.out.println(linkedStack);
		linkedStack.pop();
		System.out.println(linkedStack);
		System.out.println(linkedStack.size());
		System.out.println("Peek element: "+linkedStack.peek());

	}

}
