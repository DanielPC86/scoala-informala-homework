public class Computer extends ElectronicsProduct {

    public Computer(String name, double price, int quantity, String ageRestriction, int guaranteePeriod) {
        super(name, price, quantity, ageRestriction, guaranteePeriod);
    }

    //method that returns 95% of the price if the quantity is over 1000;
    public double getPrice() {

        if (getQuantity() > 1000)
            return super.getPrice() * 0.95;
        return super.getPrice();

    }
}

