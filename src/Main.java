import comarable.Automobil;
import comarable.Person;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // lambda ca sa verificam daca un string contine litera "A"
        // String a;  a.contains("A")

//        String x = "Ana";
//
//        boolean a = x.contains("A");
//
//        Predicate<String> s =  v -> v.contains("A");
//
//       boolean i = s.test(x);
//
//       Predicate<String> pr = s1 -> s1.contains("A");
//
//
//        // creati o lambda care afiseaza Systems.out.println("Hello World!!")
//
//        Consumer<String> cons = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        };
//
//        cons.accept("Hello World!!");
//
//        Consumer<String> consumer = c  -> System.out.println(c);
//
//        consumer.accept("Hello World!!");
//
//        // "Hello world!!"
//
//        Supplier<String> supplier = () -> "Hello World!";
//
//        supplier.get();


        // HashSet<String>, TreeSet<String>, HashMap<String>, TreeMap<String>


//        HashSet<Person> hash = new HashSet<>();
//        hash.add(new Person("Ion", 23));

//        TreeSet<Integer> treeSet = new TreeSet<>();
//        treeSet.add(2);
//        treeSet.add(1);
//        treeSet.add(5);
//        treeSet.add(3);

                  // 2
         // 1              5
                      // 3


        TreeSet<Person> people = new TreeSet<>();
        people.add(new Person("Vasile", 24));
        people.add(new Person("Ion", 23));
        people.add(new Person("Vlad", 30));
        people.add(new Person("Andrei", 25));
        people.add(new Person("Grigore", 25));


        people.stream().forEach(s -> System.out.println(s));

                       // 24
              // 23                // 30
                          //And -25
                                // 25 -Grig


        TreeMap<Person, Integer> map = new TreeMap<>();
        map.put(new Person("Vasile", 24), 20000);
        map.put(new Person("Ion", 23), 20000);
        map.put(new Person("Vlad", 25), 20000);

        HashMap<Person, Integer> hashMap = new HashMap<>();
        hashMap.put(new Person("Vasile", 24), 20000);
        hashMap.put(new Person("Ion", 24), 20000);
        hashMap.put(new Person("Ion", 24), 20000);


        List<Automobil> automobile = new ArrayList<>();

        automobile.add(new Automobil("Bmw", 20000));
        automobile.add(new Automobil("Mercedes", 40000));
        automobile.add(new Automobil("Hinda", 15000));
        automobile.add(new Automobil("Bmw", 25000));


      List<Automobil> sortedByPrice = getAutoSorted(automobile, (a1, a2) -> a1.getPrice() - a2.getPrice());








      List<Automobil> sortedByModel = getAutoSorted(automobile, (a1, a2) -> a1.getModel().compareTo(a2.getModel()));


      // Comparable - implicit, Comparator -

      List<Person> personList = new ArrayList<>();
        personList.add(new Person("Vasile", 24));
        personList.add(new Person("Ion", 23));
        personList.add(new Person("Vlad", 30));
        personList.add(new Person("Andrei", 25));
        personList.add(new Person("Grigore", 25));

        personList.stream()
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .forEach((p) -> System.out.println(p));

        personList.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));

        Collections.sort(personList);
        Collections.sort(personList, (p1, p2) -> p1.getName().compareTo(p2.getName()));

        TreeSet<Person> people1 = new TreeSet<>((p1, p2) -> p1.getName().compareTo(p2.getName()));
        people1.add(new Person("Ion", 23));

        TreeMap<Person, Integer> personIntegerTreeMap  = new TreeMap<>((p1, p2) -> p1.getName().compareTo(p2.getName()));

        Collections.binarySearch(personList, new Person());


        // 1, 2, 3, 4, 5, 6, 7, 8

    }


   static List<Automobil> getAutoSorted(List<Automobil> list, Comparator<Automobil> comparator) {
        return list.stream()
                .sorted(comparator.reversed())
                .collect(Collectors.toList());
    }

}