class TSVDataType implements DataType {
    @Override
    public void extractData() {
        // __________(11)__________.extract();
        new TSVExtraction().extract();
    }
}
