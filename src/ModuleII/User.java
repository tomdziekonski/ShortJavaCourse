package ModuleII;

public class User {
    String name;
    String email;
    int age;
    boolean isUserAnAdult;

    public User(String provideName, String provideEmail, int provideAge) {
        this.name = provideName;
        this.email = provideEmail;
        this.age = provideAge;
        this.isUserAnAdult = isUserAnAdult();

    }

    public boolean isUserAnAdult() {
        if (this.age >= 18) {
            return true;
        }
        return false;
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
}
