package algo.problems;

public class CodingException {

	
	public int testException(){
		try{
			System.out.println("In try");
			return 0;
		}finally{
			System.out.println("In finally");
		}
	}
	
	public static void main(String[] args) {
		CodingException codingException = new CodingException();
		codingException.testException();
	}
}
