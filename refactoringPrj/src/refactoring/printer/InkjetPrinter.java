package refactoring.printer;

public class InkjetPrinter extends Printer {
	PrintCartridge cartridge;

	
	public InkjetPrinter(String ID) {
		this.ID = ID;
		cartridge = new PrintCartridge(100, 0.5);
	
	}
	
	public void printing(Object msg) {
		System.out.println("*잉크젯 방식으로 프린트를 시작합니다.*");
		System.out.println(msg.toString());
		System.out.println("*잉크젯 방식으로 프린트를 종료합니다.*");	
		
		cartridge.consume();
	}
	
	public void alert() {
		System.out.println("잉크가 부족합니다. 빨간 램프를 깜박깜박~ ");
	}
	

	public boolean isPrintable() {
		return cartridge.isAvailable();
	}	
}