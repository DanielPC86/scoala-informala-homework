public class MainShop {

    public static void main(String[] args) {

        Computer pc1 = new Computer("IBM", 1200, 1100, Product.AGE_RESTRICTION_NONE, 24);
        System.out.println("You have a discount, the price for your pc is now " + pc1.getPrice());

        Appliance app1 = new Appliance("Mac Book Pro", 500, 45, Product.AGE_RESTRICTION_NONE, 6);
        System.out.println("The price for your Mac Book is " + app1.getPrice());

        Product p1 = new Product("Kent", 40, 0, Product.AGE_RESTRICTION_ADULT_ONLY);
        Customer c1 = new Customer("John", 35, 55);
        PurchaseManager.processPurchase(p1, c1);

        FoodProduct p2 = new FoodProduct("Milk", 5, 1, Product.AGE_RESTRICTION_NONE);
        Customer c2 = new Customer("Alex", 15, 3);
        PurchaseManager.processPurchase(p2, c2);

        Product p3 = new Product("Whiskey", 55, 1, Product.AGE_RESTRICTION_ADULT_ONLY);
        Customer c3 = new Customer("Bob", 16, 100);
        PurchaseManager.processPurchase(p3, c3);
    }
}
