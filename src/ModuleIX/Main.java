package ModuleIX;

import java.util.*;

import static ModuleVIII.Music.getName;

public class Main {
    public static void main(String[] args) {
//        List<String> firstNames = new ArrayList<>();
//        firstNames.add("Tom");
//        firstNames.add("Rob");
//        firstNames.add("Pat");
//        firstNames.add("Seb");
//        firstNames.add("Mar");
//
//        List<String>firstNames2 = new ArrayList<>();
//        firstNames2.add("Ann");
//
//        System.out.println(firstNames);
//
//        for(String i: firstNames){
//            System.out.println(i);
//        }
//
//        firstNames.remove("Mar");
//        System.out.println(firstNames);
//
//        System.out.println(firstNames.get(0));
//        System.out.println(firstNames.size());
//        System.out.println(firstNames.isEmpty());
//        System.out.println(firstNames.contains("Pat"));
//
//        firstNames.addAll(firstNames2);
//        System.out.println(firstNames);
//        firstNames.removeAll(firstNames2);
//        System.out.println(firstNames);
//
//        Collections.sort(firstNames);
//        System.out.println(firstNames);
//        Collections.reverse(firstNames);
//        System.out.println(firstNames);
//
//        System.out.println("---------------------------------");
//
//        List<User> users = new ArrayList<>();
//        users.add(new User("Tom", "tom@wp.pl", 17));

//        Integer[]array = {1, 2, 3, 4, 5};
//
//        int first = array[0];
//
//        for (int i: array){
//            System.out.println(i);
//        }
//
//        for(int i = 0; i < array.length; i++){
//            if (i == 0){
//                array[0] = array[array.length -1];
//            }
//
//            if (i == array.length-1){
//                array[array.length -1] = first;
//            }
//        }
//
//        System.out.println("---------------------------");
//        for (int i: array){
//            System.out.println(i);
//        }

//        User user = new User("Tom", "email1@n.pl", 17);
//        User user2 = new User("Pat", "email2@n.pl", 19);
//        User user3 = new User("Raul", "email3@n.pl", 13);
//
//        List<User> list = new ArrayList<>();
//        list.add(user);
//        list.add(user2);
//        list.add(user3);
//
//        for(User i: list){
//            System.out.println(i.getName());
//        }
//
//        Collections.sort(list, Comparator.comparing(User::getName));
//
//        for(User i: list){
//            System.out.println(i.getName());
//        }
//
//        Collections.sort(list, Comparator.comparingInt(User::getAge).reversed());
//
//        for(User i: list){
//            System.out.println(i.getAge());
//        }
//
//        for(User i: list){
//            System.out.println(i.getName() + " ma " + i.getAge() + " lat");
//        }
//        int[]array = {40, 30, 20};
//        int[]results = new int[3];
//
//        for (int i : array){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for (int i = 0; i<array.length; i++){
//            if(i==0){
//                results[results.length-1] = array[0];
//            }
//
//            else{
//                results[i-1] = array[i];
//            }
//        }
//
//        for (int i : results){
//            System.out.print(i + " ");
//        }
//
//        System.out.println();
//
//        Set<String>zestaw = new HashSet<>();
//        zestaw.add("Tom");
//        zestaw.add("Pat");
//        zestaw.add("Paul");
//        zestaw.add("Tom");
//
//        System.out.println(zestaw.size());
//
//        Set<String>sortowanie = new TreeSet<>(zestaw);
//
//        for (String i: sortowanie){
//            System.out.println(i);
//        }

//        User user1 = new User("Tom", "mail@1.pl", 17);
//        User user2 = new User("Pat", "mail@1.pl", 14);
//        User user3 = new User("Tom", "mail@1.pl", 17);
//        User user4 = new User("Rob", "mail@1.pl", 17);
//        User user5 = new User("Paul", "mail@1.pl", 17);
//
//        Set<User>users = new HashSet<>();
//        users.add(user1);
//        users.add(user2);
//        users.add(user3);
//        users.add(user4);
//        users.add(user5);
//
//        for(User i: users){
//            System.out.println(i.getName());
//        }
//
//        Set<User> sortedUsers = new TreeSet<>(users);
//
//        for(User i: sortedUsers){
//            System.out.println(i.getName());
//        }

//        Map<Integer, String> mapa = new HashMap<>();
//        mapa.put(1, "Tom");
//        mapa.put(2, "Pat");
//        mapa.put(30, "Rob");
//        mapa.put(4, "Paul");
//        mapa.put(9, "George");
//
//        System.out.println(mapa);
//
//        for(String i: mapa.values()){
//            System.out.println(i);
//        }
//
//        Map<Integer, String>mapa2 = new TreeMap<>(mapa);
//        System.out.println(mapa);
//
//        System.out.println("-------------------------");
//
//        Map<Integer, String> mapa3 = new LinkedHashMap<>();
//        mapa3.put(1, "Tom");
//        mapa3.put(2, "Pat");
//        mapa3.put(30, "Rob");
//        mapa3.put(4, "Paul");
//        mapa3.put(9, "George");
//
//        System.out.println(mapa3);
//
//        System.out.println("---------------");
//
//        for (Map.Entry<Integer, String> i: mapa3.entrySet()){
//            System.out.println(i);
//        }

        List<Bug> bugs = new ArrayList<>();
        bugs.add(new Bug("Login", 1));
        bugs.add(new Bug("Logout", 2));
        bugs.add(new Bug("Sorting", 3));
        bugs.add(new Bug("Diagram", 4));
        bugs.add(new Bug("Logout", 2));

        for(Bug i : bugs){
            System.out.println(i.getDesc());
        }

        List<Bug> filteredBugs = new ArrayList<>();

        for (Bug i: bugs){
            if (!filteredBugs.contains(i)){
                filteredBugs.add(i);
            }
        }

        Collections.sort(filteredBugs, Comparator.comparing(Bug::getDesc));

        System.out.println("-------------------");
        for(Bug i : filteredBugs){
            System.out.println(i.getDesc());
        }

    }
}
