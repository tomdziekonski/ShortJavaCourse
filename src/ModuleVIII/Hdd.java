package ModuleVIII;

import java.util.Objects;

public class Hdd {
    protected String brand;
    protected int size;

    public Hdd(String brand, int size){
        this.size = size;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hdd hdd = (Hdd) o;
        return size == hdd.size && Objects.equals(brand, hdd.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, size);
    }

    @Override
    public String toString() {
        return "(" + brand + " " + size + ")";
    }
}
