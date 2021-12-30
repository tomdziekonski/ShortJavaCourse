package ModuleIX;

import java.util.Objects;

public class Bug {
    private String description;
    private int id;

    public Bug (String description, int id){
        this.description = description;
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public String getDesc(){
        return this.description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bug bug = (Bug) o;
        return id == bug.id && Objects.equals(description, bug.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, id);
    }
}
