package ModuleVI;

public class PC extends Computer {
    private boolean isPluggedIn;

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
        this.isPluggedIn = false;
    }

    public void plugIn(){
        this.isPluggedIn = true;
    }

    public void unplug(){
        this.isPluggedIn = false;
    }

    public void printName(){
        System.out.println(name);
    }

    public void turnOn() {
        if (this.isPluggedIn){
            System.out.println( "PC is plugged in, turning on");
            super.turnOn();
        }
        else {
            System.out.println("PC is unplugged, not possible to turn it on");
        }
    }
}
