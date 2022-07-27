package com.josh.training.java.oops.question3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Assignments.Question12;

public class CircleTest {

	private Circle circle;

	@Before
	public void initialize() throws Exception {
		circle =new Circle();
	}

	@Test
	public void shouldReturnAreaOfCircle() {
		circle.setRadius(5.0);
		double expected = (Math.PI * Math.pow(circle.getRadius(), 2));
		double actual = circle.getArea();
		assertTrue(expected-actual == 0);
	}
	
	@Test
	public void shouldReturnPerimeterOfCircle() {
		circle.setRadius(7.0);
		double expected=2 * Math.PI * circle.getRadius();
		double actual=circle.getPerimeter();
		assertTrue(expected-actual == 0);
	}
	@After
	public void tearDown() throws Exception {
	}

}
