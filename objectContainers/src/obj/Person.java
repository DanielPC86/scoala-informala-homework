package obj;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Person implements Comparable {

    private String SSN;
    private String name;
    private Integer age;

    public Person(String SSN, String name, Integer age) {
        this.SSN = SSN;
        this.name = name;
        this.age = age;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(getSSN(), person.getSSN()) &&
                Objects.equals(getName(), person.getName()) &&
                Objects.equals(getAge(), person.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSSN(), getName(), getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "SSN='" + SSN + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    /**
     * Method that shows hobbies of a person
     * @param map person as key and hobby as value
     * @param p one person
     */
    public void getHobbies(Map<Person, List<Hobby>> map, Person p) {
        for (Hobby hobby : map.get(p)) {
            System.out.println(p.getName() + " " + hobby);
        }
    }
}
