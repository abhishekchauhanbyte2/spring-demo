package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class ControllerTest {

	@InjectMocks
	public DemoClass demo;
	
	@SuppressWarnings("deprecation")
	@BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void callTest() {
		String testResult = demo.call();
		assertEquals("Welcome to your application" , testResult);		
	}
	
}
