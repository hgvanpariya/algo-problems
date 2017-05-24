package algo.problems.ds;

public class MyLinkedList<T> {
	public T data;
	public MyLinkedList<T> next;

	public MyLinkedList(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public MyLinkedList<T> getNext() {
		return next;
	}

	public void setNext(MyLinkedList<T> next) {
		this.next = next;
	}

	public MyLinkedList(T data, MyLinkedList<T> next) {
		super();
		this.data = data;
		this.next = next;
	}

	public MyLinkedList() {
		super();
	}

}