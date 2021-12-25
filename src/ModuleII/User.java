package ModuleII;

import java.util.Objects;

public class User {
    String name;
    String email;
    int age;
    boolean isUserAnAdult;

    public User(String provideName, String provideEmail, int provideAge) {
        this.name = provideName;
        setEmail(provideEmail);
        this.age = provideAge;
        this.isUserAnAdult = isUserAnAdult();
    }

    public boolean isUserAnAdult() {
        if (this.age >= 18) {
            return true;
        }
        return false;
    }

    public String getEmail() {
        return this.email;
    }

    public String toString() {
        if (this.isUserAnAdult()) {
            return "The user's name is " + this.name + "\n" +
                    "The user's age is " + this.age + "\n" +
                    "The user's email is " + this.email + "\n" +
                    "The user is an adult";
        }
        return "The user's name is " + this.name + "\n" +
                "The user's age is " + this.age + "\n" +
                "The user's email is " + this.email + "\n" +
                "The user is NOT an adult";
    }

    public void greeting(String name) {
        System.out.println("Hello " + name);
    }

    public void greeting() {
        System.out.println("Hello " + this.name);
    }

    public int addYearsToAge(int number) {
        return this.age + number;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            System.out.println("Incorrect email address");
        } else {
            this.email = email;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && isUserAnAdult == user.isUserAnAdult && Objects.equals(name, user.name) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, age, isUserAnAdult);
    }
}
