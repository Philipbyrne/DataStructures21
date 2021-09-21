public class LinkedStack<E> implements Stack<E> {

	private SinglyLinkedList<E> list = new SinglyLinkedList<>();
	public LinkedStack(){

	}

	public static void main(String[] args) {
		Stack<Integer> S = new LinkedStack<>();
		S.push(1);
		S.push(2);
		S.push(3);
		System.out.println(S.size());
		S.pop();
		S.isEmpty();
		S.pop();
		S.pop();
		S.isEmpty();
		S.push(2);
		S.push(6);
		System.out.println(S.top());
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
	public void push(E e) {
		list.addFirst(e);
	}

	@Override
	public E top() {
		return list.first();
	}

	@Override
	public E pop() {
		return list.removeFirst();
	}

}
