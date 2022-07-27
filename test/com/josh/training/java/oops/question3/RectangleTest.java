package com.josh.training.java.oops.question3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RectangleTest {

	private Rectangle rectangle;

	@Before
	public void initialize() throws Exception {
		rectangle =new Rectangle();
	}
	
	@Test
	public void shouldReturnAreaOfRectangle() {
		rectangle.setLength(5.0);
		rectangle.setLength(6.0);
		double expected= rectangle.getLength() * rectangle.getWidth();
		double actual= rectangle.getArea();
		assertTrue(expected-actual == 0);
	}
	
	@Test
	public void shouldReturnPerimeterOfRectangle() {
		rectangle.setLength(5.0);
		rectangle.setLength(6.0);
		double expected= 2 *(rectangle.getLength() + rectangle.getWidth());
		double actual= rectangle.getPerimeter();
		assertTrue(expected-actual == 0);
	}
	@After
	public void tearDown() throws Exception {
	}


	
}
