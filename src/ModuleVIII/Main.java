package ModuleVIII;

public class Main {
    public static void main(String[] args) {
        Laptop lap = new Laptop("Apple", "laptop", new Hdd("Samsung", 500),new Ram("Gaming", 16), 5);
        Laptop lap2 = new Laptop("Apple", "laptop", new Hdd("Toshiba", 250), new Ram("Data", 16), 5);
        Computer pc = new Laptop("Compaq", "desktop", new Hdd("Hitashi", 100), new Ram("Chinese",128), 5);
        Computer pc2 = new Laptop("Compaq", "desktop", new Hdd("Seagate", 128), new Ram("Unknown", 32), 5);

        Integer test = Integer.valueOf(10);

        lap.pauseMusic();
        lap.stopMusic();
        lap.playMusic();
        lap.hello();

        lap.playVideo();
        lap.pauseVideo();
        lap.stopVideo();
        lap.helloVideo();

        System.out.println(lap.equals(lap2));
        System.out.println(lap);
    }
}
