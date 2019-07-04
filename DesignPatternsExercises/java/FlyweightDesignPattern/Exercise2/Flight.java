public class Flight {
    private String company;

    public Flight(String company) {
        this.company = company;
    }

    public void __________(1)__________(int flightNumber, double latitude, double longitude) {
        System.out.println(company + " flight " + flightNumber + " is currently at latitude " + latitude +
                " and longitude " + longitude);
    }
}
