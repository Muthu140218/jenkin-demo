package com.example.jenkin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinDemoApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkinDemoApplicationTests.class);

	
	@Test
	void contextLoads() {
		logger.info("Test Cases executing....");
		assertEquals(true, true);
	}

}
