package refactoring.printer;

public abstract class Printer implements Printable{

	protected String ID;

	public Printer() {
		super();
	}

	public String getID() {
		return ID;
	}

	public void testPrinting() {
		print("아아~ 프린트 테스트. 프린트 테스트");												 
	}
    
	//Template Method 
	public void print(Object msg) {
		if ( isPrintable() ) {
			printing(msg);			
		} else 
			alert();				
	}

	public abstract void alert();
	
	public abstract boolean isPrintable();
	
	public abstract void printing(Object msg);

	//public abstract void print(Object msg);
	
	//Factory method
	public static Printer create(PrinterType type, String ID){
		Printer printer = null;
		
		switch (type) {
		case LASER:
			printer = new LaserPrinter(ID);
			break;
		case INKJET:
			printer = new InkjetPrinter(ID);
			break;
		case DOT:
			printer = new DotPrinter(ID);
			break;
		default:
			System.out.println("부적합한 프린터입니다!!");
			break;
		}
		return printer;
		
	}
	
}