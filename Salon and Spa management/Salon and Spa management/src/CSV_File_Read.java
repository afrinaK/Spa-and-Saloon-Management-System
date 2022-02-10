
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSV_File_Read {

	public static void main(String[] args) 
			throws FileNotFoundException, IOException, CsvValidationException{
		
        List<List<String>> records = new ArrayList<List<String>>();
try (CSVReader csvReader = new CSVReader(new FileReader("sample.csv"));) {
    String[] values = null;
    while ((values = csvReader.readNext()) != null) {
        records.add(Arrays.asList(values));
    }
}
		
	}}