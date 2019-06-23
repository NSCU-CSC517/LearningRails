import java.util.Scanner;

public class StrategyPatternExample {

	public static void main(String[] args) {
	
		System.out.println("Select one of the data types (d-Database/c-CSV/t-TSV): ");
		Scanner sc = new Scanner(System.in);
		String datatype = sc.nextLine();

		Data data = null;
		switch (datatype) {
		case "d":
			// data = _________(7)_________
			data = new Database();

			break;
		case "c":
			// data = _________(8)_________
			data = new CSVData();
			
			break;
		case "t":
			// data = _________(9)_________
			data = new TSVData();

			break;
		}
		
		data.extractData();
		sc.close();
	}
}





