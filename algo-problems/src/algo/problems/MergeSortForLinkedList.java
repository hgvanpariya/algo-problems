package algo.problems;

import algo.problems.ds.MyLinkedList;

public class MergeSortForLinkedList {

	public MyLinkedList<Integer> mergeSort(MyLinkedList<Integer> head1, MyLinkedList<Integer> head2) {

		// Corner cases
		if (head1 == null && head2 == null) {
			return null;
		}
		if (head1 == null && head2 != null) {
			return head1;
		}
		if (head1 != null && head2 == null) {
			return head2;
		}

		MyLinkedList<Integer> head = new MyLinkedList<Integer>(0);

		MyLinkedList<Integer> tmp = head;

		while (head1 != null && head2 != null) {

			if (head1.getData() < head2.getData()) {
				tmp.next = head1;
				head1 = head1.next;
			} else {
				tmp.next = head2;
				head2 = head2.next;
			}
			tmp = tmp.next;
		}

		// For remaining elements in First Linked list
		if (head1 != null) {
			tmp.next = head1;
		}

		// For remaining elements in Second Linked list
		if (head2 != null) {
			tmp.next = head2;
		}

		return head.next;
	}

	public static void main(String[] args) {
		MergeSortForLinkedList mergeSortForLinkedList = new MergeSortForLinkedList();
		
	}
}

