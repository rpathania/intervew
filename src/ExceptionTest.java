import com.trp.interview.CustomException;

public class ExceptionTest {

	public static void main(String[] args) throws CustomException,Exception	 {

		ExceptionTest ex = new ExceptionTest();
	
		try {
		ex.func();
		}
		catch(CustomException e) {
			System.out.println(e.toString());
		}
		
		

	}
	
	public void func() throws CustomException {
		
		if (1==1) {
			throw new CustomException("1 is not equal to 2 ");
		}
		
	}

}
