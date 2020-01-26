public class Product implements Buyable{

    public static final String AGE_RESTRICTION_NONE = "none";
    public static final String AGE_RESTRICTION_TEENAGER_AND_ABOVE = "teenager";
    public static final String AGE_RESTRICTION_ADULT_ONLY = "adult";

    private String name;
    private double price;
    private int quantity;
    private String ageRestriction;


    public Product(String name, double price, int quantity, String ageRestriction) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.ageRestriction = ageRestriction;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getAgeRestriction() {
        return ageRestriction;
    }
}
