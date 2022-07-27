package Assignments;

import static org.junit.Assert.*;


import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


//@RunWith(Parameterized.class)
public class Question12TestCase {

    private Question12 question12;
	
	@Before
	public void initialize() throws Exception {
		question12 =new Question12();
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void shouldPerformAddition() {
		assertEquals(8, question12.arithmetic(5, 3, '+'));
	}
	
	@Test
	public void shouldPerformSubtraction() {
		assertEquals(2, question12.arithmetic(5, 3, '-'));
	}
	
	@Test
	public void shouldPerformMultiplication() {
		assertEquals(15, question12.arithmetic(3, 5, '*'));
	}
	
	@Test
	public void shouldPerformDivision() {
		assertEquals(5, question12.arithmetic(10, 2, '/'));
	}
	
	@Test
	public void shouldReturnZeroIfOtherThanArithmeticOperator() {
		assertEquals(0, question12.arithmetic(3, 5, '&'));
	}
	
	
	
}


