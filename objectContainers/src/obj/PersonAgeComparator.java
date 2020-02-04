package obj;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator {

    /**
     *
     * @param o1 the first object to be compared
     * @param o2 the second object to be compared
     * @return descending order by age
     */
    @Override
    public int compare(Object o1, Object o2) {

        Person p1 = (Person) o1;
        Person p2 = (Person) o2;

        if (p1.getAge() < p2.getAge()){
            return 1;
        }

        if (p1.getAge() > p2.getAge()){
            return -1;
        }

        return 0;
    }
}
