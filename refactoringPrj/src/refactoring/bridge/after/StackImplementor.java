package refactoring.bridge.after;

public interface StackImplementor {

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}