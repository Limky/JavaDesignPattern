/* 배열로 구현된 스택 구현 클래스 */
package refactoring.bridge.after;

public class StackArray implements StackImplementor {
	private int[] items;
	private int total;
	
	public StackArray() {
		items = new int[10]; // 디폴트 
		total = -1;		
	}
		
	public StackArray(int num) {
		if ( num > 0 )
			items = new int[num];
		else
			items = new int[10]; // 디폴트 
			
		total = -1;
	}
	
	/* (non-Javadoc)
	 * @see refactoring.bridge.after.StackImplementor#push(int)
	 */
	public void push(int i) {
		if (!isFull())
			items[++total] = i;
	}
	
	/* (non-Javadoc)
	 * @see refactoring.bridge.after.StackImplementor#isEmpty()
	 */
	public boolean isEmpty() {
		return total == -1;
	}
	
	/* (non-Javadoc)
	 * @see refactoring.bridge.after.StackImplementor#isFull()
	 */
	public boolean isFull() {
		return total == items.length - 1;
	}
	
	/* (non-Javadoc)
	 * @see refactoring.bridge.after.StackImplementor#top()
	 */
	public int top() {
		if (isEmpty())
			return -1;
		return items[total];
	}
	
	/* (non-Javadoc)
	 * @see refactoring.bridge.after.StackImplementor#pop()
	 */
	public int pop() {
		if (isEmpty())
			return -1;
			
		return items[total--];
	}
	
}