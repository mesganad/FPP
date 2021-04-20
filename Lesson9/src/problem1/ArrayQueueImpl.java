package problem1;

import java.util.Arrays;

public class ArrayQueueImpl {
	private int[] items;
	private int front;
	private int rear;
	private int size;

	public ArrayQueueImpl() {
		this.items = new int[10];
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("The queue is empty!");
			return -1;

		}
		return items[front];
	}

	public void enqueue(int item) {

		if (isFull()) {
			resize();
		}
		items[rear++] = item;
		size++;

	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("The queue is empty!");
			return -1;
		}
		int oldFront = items[front];
		items[front++] = 0;

		return oldFront;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public boolean isFull() {
		return (size == items.length);
	}

	public int size() {
		return size;
	}

	private void resize() {
		System.out.println("resizing");
		int len = items.length;
		int newLen = 2 * len;
		int[] temp = new int[newLen];
		System.arraycopy(items, 0, temp, 0, len);
		items = temp;
	}

	@Override
	public String toString() {
		return Arrays.toString(items);
	}
}