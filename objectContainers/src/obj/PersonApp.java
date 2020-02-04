package obj;

import java.util.*;

/**
 * @author Porumboiu Daniel
 */

public class PersonApp {

    public static  void main(String[] args) {

        /**
         * Creating objects of type Person
         */
        Person p1 = new Person("42398907", "Alex", 31);
        Person p2 = new Person("42398901", "Dani", 33);
        Person p3 = new Person("42393907", "Andreea", 18);
        Person p4 = new Person("42312907", "Ioana", 24);
        Person p5 = new Person("44398907", "George", 42);
        Person p6 = new Person("52398907", "Marius", 34);
        Person p7 = new Person("22398907", "Ion", 56);

        /**
         * Creating an object that calls the compare method
         * from PersonAgeComparator class, that sort the persons in the collection
         * by age from highest to lowest
         */
        Comparator c = new PersonAgeComparator();

        /**
         *Creating new TreeSet named person
         * using the external specification of sorting order from c Comparator
         */
        TreeSet person = new TreeSet(c);

        /**
         * Adding the objects in the collection
         */
        person.add(p1);
        person.add(p2);
        person.add(p3);
        person.add(p4);
        person.add(p5);
        person.add(p6);
        person.add(p7);

        /**
         * Looping over the TreeSet and printing
         * the persons name and age in descending order
         */
        for (Object persons : person) {
            Person p = (Person) persons;
            System.out.println(p.getName() + " age " + p.getAge());
        }
        /**
         * Creating objects of type Country
         */
        Country c1 = new Country("Romania", "1234");
        Country c2 = new Country("Germany", "1224");
        Country c3 = new Country("Italy", "1274");
        Country c4 = new Country("Spain", "1284");
        /**
         * creating objects of type Address
         */
        Address a1 = new Address("1 Decembrie", c1);
        Address a2 = new Address("Weiss", c2);
        Address a3 = new Address("Plaza", c3);
        Address a4 = new Address("Jose Manuel", c4);
        /**
         * Creating objects of type Hobby
         */
        Hobby h1 = new Hobby("gym", 3, Arrays.asList(a2));
        Hobby h2 = new Hobby("swimming", 2, Arrays.asList(a1, a2, a3));
        Hobby h3 = new Hobby("paintball", 1, Arrays.asList(a4));
        Hobby h4 = new Hobby("mountain biking", 1, Arrays.asList(a2, a4));
        /**
         * HashMap that hold person as key and hobby as value
         */
        Map<Person, List<Hobby>> map1 = new HashMap<>();
        map1.put(p1, new ArrayList<>(Arrays.asList(h1)));
        map1.put(p2, new ArrayList<>(Arrays.asList(h2)));
        map1.put(p3, new ArrayList<>(Arrays.asList(h3)));
        map1.put(p4, new ArrayList<>(Arrays.asList(h4)));

        p1.getHobbies(map1, p1);
        p2.getHobbies(map1, p2);
    }
}
