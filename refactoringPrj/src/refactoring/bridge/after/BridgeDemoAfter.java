/*
* 상속 계층도를 찢어 분리하기 (Tease Apart Inheritance)
*/
 
package refactoring.bridge.after;

/* Tease Apart Inheritance */
public class BridgeDemoAfter {
	public static void main(String[] args) {
		Stack[] stacks = { new EvenNumberStack(new StackArray()), new OddNumberStack(new StackArray())};		
	
		for (int i = 0; i < stacks.length; i++)
			pushNumber(stacks[i], 1, 50);
				
		for (int j = 0;  j < stacks.length; j++) {
			printStack(stacks[j]);			
		}		
	}
	
	/* start부터 end까지 stack에 숫자를 입력한다. */
	public static void pushNumber(Stack stack, int start, int end) {
		for (int i = start; i <= end; i++)
			stack.push(i);
	}
	
	/* 스택의 값들을 pop해서 출력한다.*/
	public static void printStack(Stack stack) {
		while (!stack.isEmpty())
			System.out.print(stack.pop() + "  ");
		System.out.println();
	}
		
}




