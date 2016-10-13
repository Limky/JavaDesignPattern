package refactoring.vectorstack;

import java.util.Vector;

public class Stack {
		
	private Vector vector = new Vector();
	public void push(int in) {
		vector.add(new Integer(in));
	}
	
	public int pop() {
		return ((Integer)vector.remove(vector.size()-1)).intValue();
	}
	
	public int top() {
		return ((Integer)vector.get(vector.size()-1)).intValue();
	}
	
	public boolean isEmptyStack() {
		return vector.isEmpty();
	}
	
	public boolean isFull() {
		return false;
	}	
}