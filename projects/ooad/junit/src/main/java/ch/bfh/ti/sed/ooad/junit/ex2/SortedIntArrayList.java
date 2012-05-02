package ch.bfh.ti.sed.ooad.junit.ex2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author buergich
 * 
 */
public class SortedIntArrayList extends ArrayList<Integer> {

	private static final long serialVersionUID = 1L;

	/**
	 * Adds an integer val such that the list is always sorted in ascending
	 * order
	 * 
	 * @param val
	 */
	public void addInt(Integer val) {
		this.add(val);
		Collections.sort(this);
	}
}
