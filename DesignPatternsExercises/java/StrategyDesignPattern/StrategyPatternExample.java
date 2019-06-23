import java.util.Scanner;

public class StrategyPatternExample {

	public static void main(String[] args) {
	
		System.out.println("Select one of the data types (d-Database/c-CSV/t-TSV): ");
		Scanner sc = new Scanner(System.in);
		String datatype = sc.nextLine();

		Data data = null;
		switch (datatype) {
		case "d":
			// data = __________(7)__________
			data = new Database();

			break;
		case "c":
			// data = __________(8)__________
			data = new CSVData();
			
			break;
		case "t":
			// data = __________(9)__________
			data = new TSVData();

			break;
		}
		
		data.extractData();
		sc.close();
	}
}
