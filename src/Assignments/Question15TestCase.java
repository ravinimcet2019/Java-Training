package Assignments;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

 
public class Question15TestCase {

	private Question15 question15;

	@Before
	public void initialize() throws Exception {
		question15=new Question15();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int [] arrayToSend= {5,2,4,3,1};
		int [] expectedArray= {1,2,3,4,5};
		int [] returned=question15.bubbleSort(arrayToSend);
		assertArrayEquals(expectedArray,returned);
	}

}
