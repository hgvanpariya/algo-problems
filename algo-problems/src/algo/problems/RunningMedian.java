package algo.problems;

import java.util.Comparator;
import java.util.PriorityQueue;

public class RunningMedian {

	private PriorityQueue<Integer> higherHeap = new PriorityQueue<>();
	private PriorityQueue<Integer> lowerHeap = new PriorityQueue<>(new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			return (-1 * (o1 - o2));
		}
	});

	public void addNum(int i) {

		if (higherHeap.size() == 0) {
			higherHeap.add(i);
		} else {
			if (higherHeap.peek() < i) {
				higherHeap.add(i);
			} else {
				lowerHeap.add(i);
			}

		}
		rebalance();
	}

	private void rebalance() {
		PriorityQueue<Integer> smallHeap = lowerHeap.size() < higherHeap.size() ? lowerHeap : higherHeap;
		PriorityQueue<Integer> bigHeap = lowerHeap.size() > higherHeap.size() ? lowerHeap : higherHeap;

		if (bigHeap.size() - smallHeap.size() > 1) {

			smallHeap.add(bigHeap.poll());
		}
	}

	public long medean() {
		PriorityQueue<Integer> smallHeap = lowerHeap.size() <= higherHeap.size() ? lowerHeap : higherHeap;
		PriorityQueue<Integer> bigHeap = lowerHeap.size() > higherHeap.size() ? lowerHeap : higherHeap;

		if (bigHeap.size() - smallHeap.size() > 0) {
			return bigHeap.peek();
		} else {
			return ((long) (smallHeap.peek() + bigHeap.peek()) / 2);
		}

	}

	public static void main(String[] args) {
		RunningMedian runningMedian = new RunningMedian();
		runningMedian.addNum(10);
		runningMedian.addNum(3);
		runningMedian.addNum(9);
		runningMedian.addNum(10);
		System.out.println(runningMedian.medean());
	}

}
