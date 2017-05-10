package algo.problems.test;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import algo.problems.GradingStudents;

public class GradingStudentsTest {

	GradingStudents gradingStudents;

	@Before
	public void setup() {
		gradingStudents = new GradingStudents();
	}

	@Test
	public void checkBestCase() {
		int[] input = new int[]{73,67,38,33};
		int[] output = new int[]{75,67,40,33};

		input = gradingStudents.solve(input);
		Arrays.equals(input, output);
	}

}
