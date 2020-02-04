package obj;

import java.util.Objects;

public class Address {

    private String addressStreet;
    private Country country;

    public Address(String addressStreet, Country country) {
        this.addressStreet = addressStreet;
        this.country = country;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(getAddressStreet(), address.getAddressStreet()) &&
                Objects.equals(getCountry(), address.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAddressStreet(), getCountry());
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressStreet='" + addressStreet + '\'' +
                ", country=" + country +
                '}';
    }
}
