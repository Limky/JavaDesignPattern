package refactoring.printer;

public class PrintCartridge {
	private double capacity;
	private double reductionRate;

	public PrintCartridge() {
		
	}

	public PrintCartridge(double capacity, double reductionRate) {
		super();
		this.capacity = capacity;
		this.reductionRate = reductionRate;
	}
	/*
	public double getCapacity() {
		return capacity;
	}
	
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	
	public double getReductionRate() {
		return reductionRate;
	}

	public void setReductionRate(double reductionRate) {
		this.reductionRate = reductionRate;
	}
*/
	public boolean isAvailable() { // 한장을 찍을 분량이 남아있으면,
		return  (capacity - reductionRate) >= 0;	
	}

	public void consume() {
		capacity -= reductionRate;
	}

	
}