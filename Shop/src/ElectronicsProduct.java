public class ElectronicsProduct extends Product {

    public int guaranteePeriod;

    public ElectronicsProduct(String name, double price, int quantity, String ageRestriction, int guaranteePeriod) {
        super(name, price, quantity, ageRestriction);
        this.guaranteePeriod = guaranteePeriod;
    }

}
