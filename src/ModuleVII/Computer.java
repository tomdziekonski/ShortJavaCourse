package ModuleVII;

public abstract class Computer {

    protected String name;
    protected String type;
    protected int hdd;
    protected int ram;
    protected boolean state;
    protected int volume;

    public Computer(String name, String type, int hdd, int ram) {
        this.name = name;
        this.type = type;
        this.hdd = hdd;
        this.ram = ram;
        this.state = false;
        this.volume = 0;
    }

    public String getName() {
        return name;
    }

    public abstract void volumeUp(int level);
    public abstract void volumeDown(int level);

    public abstract void volumeUp();
    public abstract void volumeDown();

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void turnOn() {
        System.out.println("Turning off " + this.name);
        this.state = true;
    }

    public void turnOff() {
        this.state = false;
    }

    public boolean isTurnedOn() {
        return this.state;
    }

    public void printMe() {
        System.out.println("Hello");
    }

    public int volumeLevel(){
        return this.volume;
    }

}
