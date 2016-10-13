/*
* ��� �������� ���� �и��ϱ� (Tease Apart Inheritance)
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
	
	/* start���� end���� stack�� ���ڸ� �Է��Ѵ�. */
	public static void pushNumber(Stack stack, int start, int end) {
		for (int i = start; i <= end; i++)
			stack.push(i);
	}
	
	/* ������ ������ pop�ؼ� ����Ѵ�.*/
	public static void printStack(Stack stack) {
		while (!stack.isEmpty())
			System.out.print(stack.pop() + "  ");
		System.out.println();
	}
		
}




