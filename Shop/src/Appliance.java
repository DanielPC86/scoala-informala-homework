public class Appliance extends ElectronicsProduct {

    public Appliance(String name, double price, int quantity, String ageRestriction, int guaranteePeriod) {
        super(name, price, quantity, ageRestriction, guaranteePeriod);
    }

    //method that returns 105% of the price if the quantity is less than 50;
    public double getPrice() {

        if (getQuantity() < 50)
            return super.getPrice() * 1.05;
        return super.getPrice();
    }
}
