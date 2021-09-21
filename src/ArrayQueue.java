public class ArrayQueue<E> implements Queue<E> {

	private E[] data;
	private int front = 0;
	private int size = 0;

	public ArrayQueue(int capacity){
		data = (E[]) new Object[capacity];
	}

	public static void main(String[] args) {
		ArrayQueue<Integer> queue = new ArrayQueue<>(10);
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
		return size;
	}

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}

	@Override
	public void enqueue(E e) {
		int avail = (front + size) % data.length;
		data[avail] = e;
		size++;
		
	}

	@Override
	public E first() {
		if(isEmpty()){
			return null;
		}else{
			return data[front];
		}
	}

	@Override
	public E dequeue() {
		if(isEmpty()){
			return null;
		}else{
			E answer = data[front];
			data[front] = null;
			front = (front + 1) % data.length;
			size--;
			return answer;
		}
	}

}
