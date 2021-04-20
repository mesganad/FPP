package problem1;

public class MainQueue {

	public static void main(String[] args) {

		ArrayQueueImpl queue = new ArrayQueueImpl();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		System.out.println(queue);
		System.out.println("Peek element: " + queue.peek());
		System.out.println("Dequeued element: " + queue.dequeue());
		System.out.println("Peek after dequeue:" + queue.peek());
		System.out.println(queue);
	}
}

