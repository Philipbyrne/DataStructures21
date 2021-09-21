public class ArrayStack<E> implements Stack<E> {

	public static final int CAPACITY = 1000;
	private E[] data;
	private int t = -1;
	public ArrayStack(){
		this(CAPACITY);
	}
	public ArrayStack(int capacity){
		data = (E[]) new Object[capacity];
	}
	public static void main(String[] args) {
		Stack<Integer> S = new ArrayStack<>();
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
		return (t + 1);
	}

	@Override
	public boolean isEmpty() {
		return (t == -1);
	}

	@Override
	public void push(E e) {
		data[++t] = e;
	}

	@Override
	public E top() {
		if(isEmpty()){
			return null;
		}else{
			return data[t];
		}
	}

	@Override
	public E pop() {
		if(isEmpty()){
			return null;
		}else{
			E answer = data[t];
			data[t] = null;
			t--;
			return answer;
		}
	}

}
