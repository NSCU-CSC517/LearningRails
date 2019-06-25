import java.util.Scanner;

public class StrategyPatternExample {
	public static void main(String[] args) {

		System.out.println("Select one of the data types (d-Database/c-CSV/t-TSV): ");
		Scanner sc = new Scanner(System.in);
		String datatype = sc.nextLine();

		Data data = null;
		switch (datatype) {
		case "d":
			data = __________(7)__________
			break;
		case "c":
			data = __________(8)__________
			break;
		case "t":
			data = __________(9)__________
			break;
		}
		data.extractData();
		sc.close();
	}
}
