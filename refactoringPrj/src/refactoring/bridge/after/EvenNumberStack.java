/* ¦������ ���� ���� */
package refactoring.bridge.after;

public class EvenNumberStack extends Stack {
	
	public EvenNumberStack(StackImplementor impl) {
		super(impl);
	}
	
	public void push(int in) {
		if ( in%2 != 0 ) 
			return;
		
		super.push(in);		
	}	
}