class CSVExtraction implements Extraction {
    @Override
    public void extract() {
        // __________(2)__________;
        open();
        System.out.println("CSV Data type is getting extracted by separating row by commas...");
        // __________(3)__________;
        close();
    }

    @Override
    public void open() {
        System.out.println("Opening CSV file...");
    }

    @Override
    public void close() {
        System.out.println("Closing CSV file...");
    }
}
