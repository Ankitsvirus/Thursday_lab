package CustomerManage;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int Contact=0;
		int Cust_Name=0;
		if(Contact<=1)
		{
			System.out.println("Customer Contact detail added");
		}
		else
		{
			System.out.println("failled");
		}
		if(Cust_Name<=1)
		{
			System.out.println("Customer Name added");
		}
		else
		{
			System.out.println("failled");
		}
	}

 
}