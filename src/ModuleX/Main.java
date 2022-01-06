package ModuleX;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        int[] number = {4, 6, 2, 3, 7, 8, 1, 9, 0};
//        List<Integer> result = new ArrayList<>();
//
//        for (int i = 0; i < number.length; i++) {
//            result.add(number[i]);
//        }
//
//        Collections.sort(result);
//
//        for (int i : result) {
//            System.out.print(i + " ");
//        }

//        List<String> users = new ArrayList<>();
//        users.add("Bartek");
//        users.add("Antek");
//        users.add("Tomek");
//        users.add("Filip");
//        users.add("Romek");
//        users.add("Franek");
//        users.add("Artur");
//        users.add("Feliks");

        //users.stream().forEach(System.out::println);

//        users.stream()
//                .filter(string -> string.startsWith("F"))
//                .filter(string -> string.contains("k"))
//                .filter(string -> string.endsWith("s"))
//                .forEach(System.out::println);
//
//        users.stream().map(string->string.toUpperCase()).forEach(string-> System.out.println(string));
//
//        List<String> t = users.stream().filter(string -> string.startsWith("T")).collect(Collectors.toList());
//        System.out.println(t);
//
//        users.stream().filter(str->str.length()<=5).map(str->str.toUpperCase()).map(str->"Przefiltrowane elementy: " + str).forEach(System.out::println);
//
//        long count = users.stream().filter(str -> str.length() <= 5).count();
//
//        System.out.println(count);
//
//        boolean a = users.stream().anyMatch(str -> str.contains("a"));
//        System.out.println(a);
//
//        System.out.println("----------------");
//        System.out.println(users);
//
//        boolean b = users.stream().allMatch(str -> str.length() <= 5);
//        System.out.println(b);
//
//        boolean v = users.stream().noneMatch(str -> str.startsWith("F"));
//        System.out.println(v);
//
//        List<String> f = users.stream().filter(str -> str.startsWith("F")).collect(Collectors.toList());
//        System.out.println(f);

        List<User> users = new ArrayList<>();
        users.add(new User("Bartek", "Biały", "bartek@test.com", 10));
        users.add(new User("Tomek", "Czasrny", "tomek@test.com", 10));
        users.add(new User("Marcin", "Niebieski", "marcin@test.com", 10));
        users.add(new User("Jacek", "Fioletowy", "jacek@test.com", 10));
        users.add(new User("Asia", "Zielona", "asia@test.com", 10));
        users.add(new User("Asia", "Zielona", "asia@test.com", 13));
        users.add(new User("Asia", "Biały", "asia@test.com", 10));
        users.add(new User("Marta", "Czerwona", "marta@test.com", 10));
        users.add(new User("Kasia", "Pomarańczowa", "kasia@test.com", 10));

        //Collections.sort(users, Comparator.comparing(User::getFirstName));

//        List<User> collect = users.stream().sorted(Comparator.comparing(User::getFirstName).thenComparing(User::getLastName).thenComparing(User::getAge)).collect(Collectors.toList());
//
//        for(User i: collect){
//            System.out.println(i);
//        }
        //System.out.println(collect);

        //Optional<User> max1 = users.stream().max(Comparator.comparing(User::getAge));

//        Optional<User> max1 = users.stream().max(Comparator.comparingInt(User::getAge));
//        System.out.println(max1.get());
//        System.out.println(max1.isPresent());
//        System.out.println(max1.isEmpty());

        //users.stream().filter(user -> user.getFirstName().equals("Asia")).forEach(System.out::println);

//        String s = users.stream().map(User::getFirstName).filter(user -> user.equals("Asiaa")).findFirst().orElse("No users with this name");
//        System.out.println(s);
//
//        Integer max = users.stream().map(User::getAge).max(Integer::compareTo).orElse(-1);
//        System.out.println(max);
//
//        User user1 = users.stream().filter(user -> user.getFirstName().startsWith("C")).findFirst().orElseGet(() -> new User("New", "User", "new@mail.com", 4));
//        System.out.println(user1);
//        User user2 = users.stream().filter(user -> user.getFirstName().startsWith("C")).findFirst().orElseThrow(()->new IllegalStateException("No match"));
//
        //users.stream().filter(user -> user.getFirstName().startsWith("B")).findFirst().ifPresent(user -> System.out.println(user));
        //users.stream().filter(user -> user.getFirstName().startsWith("C")).findFirst().ifPresentOrElse(user-> System.out.println(user), ()-> System.out.println("No match"));

        List<Computer> computers = new ArrayList<>();
        computers.add(new Laptop("MB PRO 1", "PRO 1", new Hdd("HP", 500), new Ram("HP", 128), 100));
        computers.add(new Laptop("MB PRO 2", "PRO 2", new Hdd("HP", 500), new Ram("HP", 128), 100));
        computers.add(new Laptop("MB PRO 3", "PRO 3", new Hdd("HP", 256), new Ram("HP", 128), 100));
        computers.add(new Laptop("MB PRO 4", "PRO 4", new Hdd("HP", 500), new Ram("HP", 128), 100));

        computers.add(new PC("PC 1", "BBB", new Hdd("HP", 500), new Ram("HP", 128)));
        computers.add(new PC("PC 1", "AAA", new Hdd("HP", 256), new Ram("HP", 256)));
        computers.add(new PC("PC 3", "PRO 3", new Hdd("HP", 500), new Ram("HP", 128)));

        System.out.println("----");
        System.out.println("Zadanie 1");

        computers.stream().filter(cmp -> cmp.getRam().getAmount() > 128).forEach(System.out::println);
        computers.stream().filter(comp -> comp.getRam().getAmount() > 128).count();

        System.out.println("----");
        System.out.println("Zadanie 2");
        computers.stream().map(Computer::getType).forEach(System.out::println);

        System.out.println("----");
        System.out.println("Zadanie 3");
        Optional<Computer> max = computers.stream().max(Comparator.comparing(cmp -> cmp.getRam().getAmount()));
        System.out.println(max);

        System.out.println("----");
        System.out.println("Zadanie 4");
        List<Computer> collect = computers.stream().filter(cmp -> cmp.getHdd().getSize() < 500).collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("----");
        System.out.println("Zadanie 5");
        computers.stream().sorted(Comparator.comparing(Computer::getName).thenComparing(Computer::getType)).forEach(System.out::println);

        System.out.println("----");
        System.out.println("Zadanie 6");
        Computer computer = computers.stream().min(Comparator.comparing(cmp -> cmp.getRam().getAmount())).get();
        System.out.println(computer);
        boolean opt = computers.stream().max(Comparator.comparing(cmp -> cmp.getHdd().getSize())).isPresent();
        boolean opt2 = computers.stream().max(Comparator.comparing(cmp -> cmp.getHdd().getSize())).isEmpty();
        Computer opt3 = computers.stream().max(Comparator.comparing(cmp -> cmp.getHdd().getSize())).orElse(new Laptop("MB PRO 1", "PRO 1", new Hdd("HP", 500), new Ram("HP", 128), 100));
        Computer opt4 = computers.stream().filter(cmp -> cmp.getName().equals("A")).findFirst().orElseGet(() -> new Laptop("Method results", "PRO 4", new Hdd("HP", 500), new Ram("HP", 128), 100));
        //Computer opt5 = computers.stream().filter(cmp -> cmp.getName().equals("A")).findFirst().orElseThrow(() -> (new IllegalStateException("Error")));
        System.out.println(opt);
        System.out.println(opt2);
        System.out.println(opt3);
        System.out.println(opt4);
        System.out.println("-------------------");
        computers.stream().filter(cmp -> cmp.getName().startsWith("M")).findFirst().ifPresent(cmp -> System.out.println(cmp));
        computers.stream().filter(cmp -> cmp.getName().startsWith("X")).findFirst().ifPresentOrElse(cmp -> System.out.println(cmp), () -> System.out.println("No match"));
    }
}

