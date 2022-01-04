package ModuleX;


import java.util.Objects;

    public abstract class Computer implements Music, Video{

        protected String name;
        protected String type;
        protected Hdd hdd;
        protected Ram ram;
        protected boolean state;
        protected int volume;

        public Computer(String name, String type, Hdd hdd, Ram ram) {
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

        public Hdd getHdd() {
            return hdd;
        }

        public void setHdd(Hdd hdd) {
            this.hdd = hdd;
        }

        public Ram getRam() {
            return ram;
        }

        public void setRam(Ram ram) {
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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ModuleX.Computer computer = (ModuleX.Computer) o;
            return hdd == computer.hdd && ram == computer.ram && state == computer.state && volume == computer.volume && Objects.equals(name, computer.name) && Objects.equals(type, computer.type);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, type, hdd, ram, state, volume);
        }

        @Override
        public String toString() {
            return "Technical specification: " + "\n" +
                    "Name: " + name + "\n" +
                    "Type: " + type + "\n" +
                    "Hdd: " + hdd + "\n" +
                    "Ram: " + ram + "\n" +
                    "State: " + state + "\n" +
                    "Volume: " + volume;
        }
    }


