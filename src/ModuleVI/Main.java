package ModuleVI;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Computer pc = new PC("Compaq", "desktop", 500, 16);
        Laptop lap = new Laptop("Microsoft", "lap", 200, 8, 5);

        ArrayList<Computer> allComputers = new ArrayList<>();
        allComputers.add(pc);
        allComputers.add(lap);

        for (Computer i : allComputers) {
            if (i instanceof PC) {
                ((PC) i).printName();
                i.turnOn();
            } else {
                i.turnOn();
            }
        }

        System.out.println(lap.test);
        System.out.println(pc.test());
    }
}
