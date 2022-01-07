package ModuleXI;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static ModuleXI.GenderEnumeration.FEMALE;
import static ModuleXI.GenderEnumeration.MALE;
import static ModuleXI.Week.MONDAY1;

public class Main {
    public static void main(String[] args) throws IOException {
//        System.out.println(Enumerations.WEDNESDAY.getName());
//        File file = new File("C:\\Users\\dziekonskit\\IdeaProjects\\Platny kurs\\src\\test.txt");
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader(file));
//            String line = reader.readLine();
//
//            while(line!=null){
//                System.out.println(line);
//                line = reader.readLine();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        finally{
//            System.out.println("Done");
//        }

//        BufferedReader reader2 = new BufferedReader(new FileReader(file));
//        String line = reader2.readLine();
//
//            while(line!=null){
//                System.out.println(line);
//                line = reader2.readLine();
//            }
//
//        String[] array = new String[5];
//        array[0] = "test5";
//        array[0] = null;
//        System.out.println(array[0]);

//    ArrayList<String> test = new ArrayList<>();
//    test.add("Tom");
//    test.add("Pat");
//    test.add("Bob");
//
//    test.stream().filter(user -> user.startsWith("X")).findFirst().orElseThrow(()-> new IllegalStateException("No match"));
//        User email = new User("test");
//        email.setEmail("5");
        System.out.println();
        System.out.println("Zadanie I");
        User user = new User("test@test.pl", FEMALE);
        User user2 = new User("adam@com.pl", FEMALE);
        User user3 = new User("dave@mega.com", MALE);
        User user4 = new User("rob@not.pl", MALE);
        User user5 = new User("pat@yes.pl", FEMALE);

        ArrayList<User> list = new ArrayList<>();
        list.add(user);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);

        list.stream().filter(usr -> usr.getGender().equals(FEMALE)).forEach(System.out::println);

        System.out.println();
        System.out.println("Zadanie II");
        File file = new File("C:\\Users\\dziekonskit\\IdeaProjects\\Platny kurs\\src\\name.txt");
        ArrayList<String> nameList = new ArrayList<>();
        Scanner scan = new Scanner(file);


        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            nameList.add(line);
        }

        String s = nameList.stream().filter(str -> !str.isEmpty()).findFirst().orElseThrow(() -> new NullPointerException());
        System.out.println(s);
        System.out.println("---");

        for (String i : nameList) {
            System.out.println(i);
        }

        Bug bugger = new Bug(1);
        bugger.setBugPriority(55);
    }
}
