package com.example.gcptest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GcptestApplicationTests {

	@Test
	void test(){
		Assertions.assertEquals(2+2,4);
	}

}
