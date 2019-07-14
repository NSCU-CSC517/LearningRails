public class StrategyDesignPattern {
    public static void main(String[] args) {
        System.out.println("Extraction tool for CSV file:");
        DataType dataType = new CSVDataType();
        dataType.extractData();

        System.out.println("\nExtraction tool for DB file:");
        dataType = new DBDataType();
        dataType.extractData();

        System.out.println("\nExtraction tool for TSV file:");
        dataType = new TSVDataType();
        dataType.extractData();
    }
}
