package ModuleXI;

public class User {
    protected String email;
    protected GenderEnumeration gender;

    public User(String email) {
        this.email = email;
    }

    public User(String email, GenderEnumeration gender) {
        this.email = email;
        this.gender = gender;
    }

    public void setEmail(String newEmail) throws IllegalBugPriorityException {
        if (!newEmail.contains("@")) {
            throw new IllegalBugPriorityException("Wrong format");
        } else {
            this.email = newEmail;
        }
    }

    public GenderEnumeration getGender() {
        return this.gender;
    }

    public void setGender(GenderEnumeration gender) {
        this.gender = gender;
    }

    public String toString(){
        return this.email + " " + this.gender.toString();
    }
}
