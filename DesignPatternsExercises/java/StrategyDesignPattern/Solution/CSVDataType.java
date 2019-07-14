class CSVDataType implements DataType {
    @Override
    public void extractData() {
        // __________(1)__________.extract();
        new CSVExtraction().extract();
    }
}
