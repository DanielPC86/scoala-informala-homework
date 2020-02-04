package obj;

import java.util.List;
import java.util.Objects;

public class Hobby implements Comparable {

    private String hobbyName;
    private int frequency;
    private List<Address> address;

    public Hobby(String hobbyName, int frequency, List<Address> address) {
        this.hobbyName = hobbyName;
        this.frequency = frequency;
        this.address = address;
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hobby hobby = (Hobby) o;
        return getFrequency() == hobby.getFrequency() &&
                Objects.equals(getHobbyName(), hobby.getHobbyName()) &&
                Objects.equals(getAddress(), hobby.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHobbyName(), getFrequency(), getAddress());
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "hobbyName='" + hobbyName + '\'' +
                ", frequency=" + frequency +
                ", address=" + address +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}