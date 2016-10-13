/* Stack ���� Ŭ������ �������̽� */
package refactoring.bridge.after;

public class Stack {
	
	private StackImplementor impl;
		
	
	 public Stack(StackImplementor impl) {
		super();
		this.impl = impl;
	}
		
	public Stack(){
		impl = new StackArray();
		
	}
		
	 void push(int i){
		 impl.push(i);
	 }
	 int pop(){
		 return impl.pop();
	 }
	 int top(){
		 return impl.pop();
		 
	 }
	 boolean isEmpty(){
		 return impl.isEmpty();
		 
	 }
	 boolean isFull(){
		 return impl.isFull();
		 
	 }
	 
	 
}