package ch.bfh.ti.sed.ooad.stack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPushPop() {
		String expected = "Test";
		Stack<String> testStack = new Stack<String>();
		testStack.push(expected);
		String actual = testStack.pop();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testEmpty() {
		Stack<String> testStack = new Stack<String>();
		assertTrue(testStack.isEmpty());
		
		String test = "Test";
		testStack.push(test);
		assertFalse(testStack.isEmpty());
		
		testStack.pop();
		assertTrue(testStack.isEmpty());
	}
	
	@Test(expected=StackUnderflowException.class)
	public void testUnderflowException() {
		Stack<String> testStack = new Stack<String>();
		testStack.pop();
	}
	
	@Test
	public void testLiFo() {
		String test1 = "Test1";
		String test2 = "Test2";
		
		Stack<String> testStack = new Stack<String>();
		testStack.push(test1);
		testStack.push(test2);
		
		String actual1 = testStack.pop();
		String actual2 = testStack.pop();
		assertEquals(test2, actual1);
		assertEquals(test1, actual2);
	}

}
