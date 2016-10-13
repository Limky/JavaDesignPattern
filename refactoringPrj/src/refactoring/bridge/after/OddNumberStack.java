/* Ȧ������ ���� ���� */
package refactoring.bridge.after;

public class OddNumberStack extends Stack {
	public OddNumberStack(StackImplementor impl) {
		super(impl);
	}
	
	public void push(int in) {
		if ( in%2 == 0 ) 
			return;
		
		super.push(in);		
	}		
}