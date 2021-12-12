package ModuleVII;

public class Main {
    public static void main(String[] args) {
        Computer pc = new PC("Compaq", "desktop", 500, 16);
        Computer laptop = new Laptop("Apple", "laptop", 200, 8, 5);
        pc.volumeUp(5);
        pc.volumeUp(5);
        pc.volumeUp(95);
        System.out.println(pc.volumeLevel());
        pc.volumeDown(100);
        pc.volumeDown(100);
        System.out.println(pc.volumeLevel());

        System.out.println("--------------------");

        laptop.volumeUp(5);
        laptop.volumeUp(95);
        laptop.volumeUp(95);
        System.out.println(laptop.volumeLevel());
        laptop.volumeDown(5);
        System.out.println(laptop.volumeLevel());
        laptop.volumeDown(955);
        System.out.println(laptop.volumeLevel());

        System.out.println("--------------------");
        pc.volumeUp();
        System.out.println(pc.volumeLevel());
        pc.volumeDown();
        System.out.println(pc.volumeLevel());
        pc.volumeDown();
        System.out.println(pc.volumeLevel());

        laptop.volumeUp();
        System.out.println(laptop.volumeLevel());
        laptop.volumeDown();
        System.out.println(laptop.volumeLevel());
        laptop.volumeDown();
        System.out.println(laptop.volumeLevel());
        System.out.println("---------------------");

        for(int i = 0; i < 150; i++){
            pc.volumeUp();
        }

        System.out.println(pc.volumeLevel());

        for(int i = 0; i < 150; i++){
            laptop.volumeUp();
        }

        System.out.println(laptop.volumeLevel());

    }
    }

