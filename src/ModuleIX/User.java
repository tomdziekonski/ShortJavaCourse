package ModuleIX;

import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private String email;
    private int age;

    public User(String name, String email, int age) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, age);
    }

    @Override
    public int compareTo(User o) {
        int result = this.getName().compareTo(o.getName());
        if (result == 0){
            result = this.getEmail().compareTo(o.getEmail());

        }
        return result;
    }
}
