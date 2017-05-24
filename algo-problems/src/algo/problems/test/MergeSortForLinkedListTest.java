package algo.problems.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import algo.problems.MergeSortForLinkedList;
import algo.problems.ds.MyLinkedList;

public class MergeSortForLinkedListTest {

	MergeSortForLinkedList mergeSortForLinkedList;

	@Before
	public void setup() {
		mergeSortForLinkedList = new MergeSortForLinkedList();
	}

	@Test
	public void mergeSortTest() {
		MyLinkedList<Integer> head1 = new MyLinkedList<Integer>(3);
		MyLinkedList<Integer> head11 = new MyLinkedList<Integer>(8);
		head1.setNext(head11);
		MyLinkedList<Integer> head12 = new MyLinkedList<Integer>(10);
		head11.setNext(head12);
		head12.setNext(new MyLinkedList<Integer>(11));

		MyLinkedList<Integer> head2 = new MyLinkedList<Integer>(5);
		MyLinkedList<Integer> head21 = new MyLinkedList<Integer>(9);
		head2.setNext(head21);
		MyLinkedList<Integer> head22 = new MyLinkedList<Integer>(15);
		head21.setNext(head22);
		head22.setNext(new MyLinkedList<Integer>(18));

		MyLinkedList<Integer> head3 = mergeSortForLinkedList.mergeSort(head1, head2);

		
		StringBuilder output = new StringBuilder();
		while (head3.getNext() != null) {
//			System.out.println(head3.getData());
			output.append(head3.getData()+",");
			head3 = head3.getNext();

		}
		
		Assert.assertTrue(output.toString().equals("3,5,8,9,10,11,15,"));
	}

}
