public class LinkedDeque<E> implements Deque<E> {

	private DoublyLinkedList<E> list = new DoublyLinkedList<>();
	public LinkedDeque(){}

	public static void main(String[] args) {
		LinkedDeque<Integer> deque = new LinkedDeque();
		System.out.println(deque.isEmpty());
		deque.addFirst(1);
		deque.addLast(2);
		deque.addFirst(3);
		System.out.println(deque.size());
		System.out.println(deque.first());
		System.out.println(deque.last());
		deque.removeFirst();
		System.out.println(deque.first());
		deque.removeLast();
		System.out.println(deque.last());
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
	public E first() {
		return list.first();
	}

	@Override
	public E last() {
		return list.last();
	}

	@Override
	public void addFirst(E e) {
		list.addFirst(e);
	}

	@Override
	public void addLast(E e) {
		list.addLast(e);
	}

	@Override
	public E removeFirst() {
		return list.removeFirst();
	}

	@Override
	public E removeLast() {
		return list.removeLast();
	}

}
