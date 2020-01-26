import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FoodProduct extends Product implements Expirable {

    public LocalDate expirationDate;


//    @Override
//    public long getExpirationDate() {
//
//        LocalDate today = LocalDate.now();
//
//        LocalDate anotherDay = LocalDate.of(2020, Month.JANUARY, 20);
//
//        long days = ChronoUnit.DAYS.between(today, anotherDay);
//        this.expirationDate = days;
//
//        return expirationDate ;
//    }

    public FoodProduct(String name, double price, int quantity, String ageRestriction) {
        super(name, price, quantity, ageRestriction);
        this.expirationDate = expirationDate;


    }


    @Override
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public double getDaysTillExpire() {

        LocalDate today = LocalDate.now();

        LocalDate anotherDay = getExpirationDate();

        long days = ChronoUnit.DAYS.between(today, anotherDay);

        if (days < 16) {
            return super.getPrice() * 0.7;
        }
        return super.getPrice();
    }

}


