package com.college;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class AppTest{

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		int fees=0;
		if(fees<=1)
		{
			System.out.println("fees paid");
		}
		else
		{
			System.out.println("not paid");
		}
	}

}