enum Country { US, UK, IN }

public class FactoryMethodDesignPattern {

    public static void main(String[] args) {
        PostCode postCode = PostCodeFactory.getInstance(Country.US, "27606");
        System.out.println(postCode.getPostalCode());
        postCode = PostCodeFactory.getInstance(Country.IN, "576222");
        System.out.println(postCode.getPostalCode());
        postCode = PostCodeFactory.getInstance(Country.UK, "SW15 5PU");
        System.out.println(postCode.getPostalCode());
    }

}
