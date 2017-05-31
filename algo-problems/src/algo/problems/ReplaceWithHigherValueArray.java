package algo.problems;

import java.util.Stack;

/**
 * In this problem statement, the element of the array has to be replaced with
 * the next higher number in the array.
 * 
 * In below example 4, is replaced with 5 because it is the first higher number
 * after 4 if you go from left to right
 * 
 * For 5 the next higher number in the array is 8.
 * 
 * Input : 4, 5, 8, 3, 9, 11, 2, 10
 * 
 * output : 5, 8, 9, 9, 11, 11, 10, 10
 * 
 * @author harikrushna
 */
public class ReplaceWithHigherValueArray {

	public int[] replaceElementWithNextHigher(int[] input) {
		if (input == null) {
			return null;
		}

		Stack<Integer> topElements = new Stack<>();

		for (int i = input.length - 1; i >= 0; i--) {
			int maxElement;
			while (!topElements.isEmpty() && topElements.peek() < input[i]) {
				topElements.pop();
			}

			if (!topElements.isEmpty()) {
				maxElement = topElements.peek();
			} else {
				maxElement = input[i];
			}

			topElements.push(input[i]);
			input[i] = maxElement;

		}
		return input;
	}

	public static void main(String[] args) {
		int[] input = new int[] { 4, 5, 8, 3, 9, 11, 2, 10 };
		ReplaceWithHigherValueArray replaceWithHigherValueArray = new ReplaceWithHigherValueArray();
		replaceWithHigherValueArray.replaceElementWithNextHigher(input);
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ",");
		}
	}
}
