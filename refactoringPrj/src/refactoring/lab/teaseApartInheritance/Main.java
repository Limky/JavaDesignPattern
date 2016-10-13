package refactoring.lab.teaseApartInheritance;
import java.io.*;

public class Main {
    private static final String SAMPLE_CSV_STRING =
          "좋은아침,Good morning.\n"
        + "안녕하세요,Hello.\n"
        + "좋은저녁,Good evening.\n"
        + "좋은밤,Good night.\n";

    private static final String SAMPLE_CSV_FILE = "file.csv";

    public static void main(String[] args) throws IOException {
        new CSVTablePrinter(new CSVFileReader(SAMPLE_CSV_FILE)).print();
        new CSVTreePrinter(new CSVStringReader(SAMPLE_CSV_STRING)).print();
    }

}
