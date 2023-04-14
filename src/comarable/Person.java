package comarable;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person> {

    int age;
    String name;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public int compareTo(Person o) {
        if(this.equals(o)) {
            return 0;
        }

        if(age < o.age) {
            return -1;
        }

        return 1;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }

    public String getName() {
        return name;
    }
}
