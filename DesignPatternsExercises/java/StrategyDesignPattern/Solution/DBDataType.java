class DBDataType implements DataType {
    @Override
    public void extractData() {
        // __________(6)__________.extract();
        new DBExtraction().extract();
    }
}
