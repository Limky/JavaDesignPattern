package refactoring.printer;

public class InkjetPrinter extends Printer {
	PrintCartridge cartridge;

	
	public InkjetPrinter(String ID) {
		this.ID = ID;
		cartridge = new PrintCartridge(100, 0.5);
	
	}
	
	public void printing(Object msg) {
		System.out.println("*��ũ�� ������� ����Ʈ�� �����մϴ�.*");
		System.out.println(msg.toString());
		System.out.println("*��ũ�� ������� ����Ʈ�� �����մϴ�.*");	
		
		cartridge.consume();
	}
	
	public void alert() {
		System.out.println("��ũ�� �����մϴ�. ���� ������ ���ڱ���~ ");
	}
	

	public boolean isPrintable() {
		return cartridge.isAvailable();
	}	
}