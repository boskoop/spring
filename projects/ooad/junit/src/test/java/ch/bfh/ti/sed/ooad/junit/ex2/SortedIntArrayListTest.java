package ch.bfh.ti.sed.ooad.junit.ex2;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

/**
 * @author buergich
 * 
 */
public class SortedIntArrayListTest {

	//                                            0,  1, 2,  3,  4
	private static final Integer[] TEMPLATE = { -18, -2, 7, 41, 50 };
	
	private SortedIntArrayList expectedList;
	private SortedIntArrayList testList;
	
	@Before
	public void setUp() {
		expectedList = new SortedIntArrayList();
		expectedList.addAll(Arrays.asList(TEMPLATE));

		testList = new SortedIntArrayList();
		testList.addAll(Arrays.asList(TEMPLATE));
	}
	
	/**
	 * Tests adding the value 3 to the list with addInt().
	 */
	@Test
	public void testAddIntMiddle() throws Exception {
		Integer value = 3;
		expectedList.add(2, value);
		
		testList.addInt(value);
		
		assertEquals("Middle insertion", expectedList, testList);
	}

	/**
	 * Tests adding the value -21 to the list with addInt()
	 */
	@Test
	public void testAddIntBeginning() throws Exception {
		Integer value = -21;
		expectedList.add(0, value);
		
		testList.addInt(value);
		
		assertEquals("Beginning insertion", expectedList, testList);
	}

	/**
	 * Tests adding the value 65 to the list with addInt()
	 */
	@Test
	public void testAddIntEnd() throws Exception {
		Integer value = 65;
		expectedList.add(5, value);
		
		testList.addInt(value);
		
		assertEquals("End insertion", expectedList, testList);
	}

	/**
	 * Tests adding the value 7 to the list with addInt()
	 */
	@Test
	public void testAddIntTwice() throws Exception {
		Integer value = 7;
		expectedList.add(3, value);
		
		testList.addInt(value);
		
		assertEquals("Double insertion", expectedList, testList);
	}
}
