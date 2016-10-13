package refactoring.lab.teaseApartInheritance;

import java.io.IOException;

public abstract class CSVPrinter {

	protected final CSVReader _csvReader;

	public CSVPrinter(CSVReader _csvReader) {
		this._csvReader = _csvReader;
	}

	  public abstract void print() throws IOException;
}
