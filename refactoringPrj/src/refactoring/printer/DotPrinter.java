package refactoring.printer;
public class DotPrinter extends Printer {
	public DotPrinter(String ID) {
		this.ID = ID;
	}
	
	public void alert() {
		// TODO Auto-generated method stub
	}

	public void printing(Object msg) {
		System.out.println("*��Ʈ ������� ����Ʈ�� �����մϴ�.*");
		System.out.println(msg.toString());
		System.out.println("*��Ʈ ������� ����Ʈ�� �����մϴ�.*");
	}
	
	public boolean isPrintable() { 
		return true;		
	}	
}