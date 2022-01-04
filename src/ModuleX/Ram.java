package ModuleX;

import java.util.Objects;

public class Ram {
    protected String brand;
    protected int amount;


    public Ram(String brnd, int amount){
        this.amount = amount;
        this.brand = brnd;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ModuleX.Ram ram = (ModuleX.Ram) o;
        return amount == ram.amount && Objects.equals(brand, ram.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, amount);
    }

    @Override
    public String toString() {
        return "(" + brand + " " + amount + ")";
    }
}
