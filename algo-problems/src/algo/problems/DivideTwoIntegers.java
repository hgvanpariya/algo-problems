package algo.problems;

/**
 * Divide two integers without using multiplication, division and mod operator.
 * 
 * @author harikrushna
 *
 */
public class DivideTwoIntegers {

	public int divide(int dividend, int divisor) {

		int div = dividend;
		int dvsr = divisor;
		int cnt = 1;
		int totcnt = 0;

		while (div > dvsr) {
			div = div - dvsr;
			dvsr = dvsr + dvsr;
			cnt = cnt + cnt;
			if (div < dvsr) {
				System.out.println(">>" + cnt);

				totcnt += cnt;
				cnt = 1;
				dvsr = divisor;
			}
		}


		System.out.println(totcnt);
		System.out.println(div);
		System.out.println(dvsr);
		return divisor;

	}

	public static void main(String[] args) {
		DivideTwoIntegers deDivideTwoIntegers = new DivideTwoIntegers();
		deDivideTwoIntegers.divide(19, 2);
	}
}
