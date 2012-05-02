package ch.bfh.ti.sed.ooad.stack;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * This class implements a stack of objects.
 */
public class Stack<T> {

	private LinkedList<T> content = new LinkedList<T>();

	/**
	 * Adds a new object onto the top of the stack.
	 * 
	 * @param v
	 *            The Integer object to add.
	 */
	public void push(T v) {
		content.addLast(v);
	}

	/**
	 * Removes the top object from the stack and returns it, if the stack is not
	 * empty, else throws an exception.
	 * 
	 * @return An object.
	 * @throws StackUnderflowException
	 *             If the stack is empty.
	 */
	public T pop() throws StackUnderflowException {
		try {
			return content.removeLast();
		} catch (NoSuchElementException e) {
			throw new StackUnderflowException(e);
		}
	}

	/**
	 * Returns true if the stack is empty, false otherwise.
	 * 
	 * @return True if the stack is empty.
	 */
	public boolean isEmpty() {
		return content.isEmpty();
	}

	/**
	 * Tests if two stacks are equal. Two stacks are equal if the sizes are
	 * equal, and if the object contents are equal. Warning: this method has 4
	 * different exit points.
	 */
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (o == this) {
			return true;
		}
		if (o instanceof Stack) {
			Stack<?> other = (Stack<?>)o;
			if (content.equals(other.content)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Returns the hash code of this stack. This guarantees that if two stacks
	 * are equal then the two hashCode are equal.
	 */
	public int hashCode() {
		return content.hashCode();
	}
}