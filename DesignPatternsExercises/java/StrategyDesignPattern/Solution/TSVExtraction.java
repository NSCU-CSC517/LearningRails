class TSVExtraction implements Extraction {
    @Override
    public void extract() {
        // __________(12)__________;
        open();
        System.out.println("TSV Data type is getting extracted by separating row by tabs...");
        // __________(13)__________;
        close();
    }

    @Override
    public void open() {
        System.out.println("Opening TSV file...");
    }

    @Override
    public void close() {
        System.out.println("Closing TSV file...");
    }
}
