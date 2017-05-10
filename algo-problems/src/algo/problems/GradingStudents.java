package algo.problems;

/**
 * Grading policy to pass the student.
 * 
 * @author harikrushna
 *
 */
public class GradingStudents {

	public int[] solve(int[] input) {

		for (int i = 0; i < input.length; i++) {
			int diffVal = input[i] % 5;

			/*
			 * Here we check if the value of the different is grater than 3. The
			 * reason of checking it with 3 is because the maximum vlaue can be
			 * given as grade is 2 marks. So, 5 - 2 = 3; So, if the Modulus of
			 * the marks are grater than 3 then by providing 2 marks the student
			 * can pass.
			 */

			if (diffVal >= 3 && input[i] > 38) {
				input[i] += (5 - diffVal);
			}

		}
		return input;

	}
}
