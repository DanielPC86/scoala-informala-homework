import static shop.Product.AGE_RESTRICTION_ADULT_ONLY;
import static shop.Product.AGE_RESTRICTION_TEENAGER_AND_ABOVE;

public class PurchaseManager {

    public static void processPurchase(Product product, Customer customer) {

        //checking if product is on stock;
        if (product.getQuantity() < 1) {
            System.out.println("Product is out of stock!");
        }

        //checking if the buyer has enough money;
        if (customer.getBalance() < product.getPrice()) {
            System.out.println("You do not have enough money to buy this product!");
        }

        //checking if the buyer is over 12 years old;
        if(product.getAgeRestriction().equals(AGE_RESTRICTION_TEENAGER_AND_ABOVE)) {
            if(customer.getAge() < 12) {
                System.out.println("You are too you to buy this product!");
            }
        }

        //checking if the buyer is over 18 years old;
        if(product.getAgeRestriction().equals(AGE_RESTRICTION_ADULT_ONLY)) {
            if(customer.getAge() < 18) {
                System.out.println("You are too young to buy this product!");
            }
        }
    }
}
