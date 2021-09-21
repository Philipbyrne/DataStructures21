public class LinkedQueue<E> implements Queue<E> {

	private SinglyLinkedList<E> list = new SinglyLinkedList<>();
	public LinkedQueue(){}

	public static void main(String[] args) {
		LinkedQueue<Integer> queue = new LinkedQueue<>();
		queue.enqueue(5);
		queue.enqueue(5);
		queue.size();
		queue.isEmpty();
		queue.first();
		queue.dequeue();
		queue.first();
		queue.size();
		queue.dequeue();
		queue.isEmpty();
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public void enqueue(E e) {
		list.addLast(e);
	}

	@Override
	public E first() {
		return list.first();
	}

	@Override
	public E dequeue() {
		return list.removeFirst();
	}

}
