package ModuleII;

public class Bug {
    String description;
    String creatorsEmail;
    int priority;
    boolean isBugOpen;

    public Bug(String description, String creatorsEmail, int priority) {
        if (priority < 1 || priority > 5) {
            System.out.println("Error during bug creation, invalid priority parameter, provide a priority in range 1-5");
        } else {
            this.description = description;
            this.creatorsEmail = creatorsEmail;
            this.priority = priority;
            this.isBugOpen = true;
        }

    }

    public void byWhomCreated() {
        System.out.println("Bug created by " + this.creatorsEmail);
    }

    public void bugStatus() {
        if (this.isBugOpen) {
            System.out.println("Bug is open");
        } else {
            System.out.println("Bug is closed");
        }
    }

    public int getBugPriority() {
        return this.priority;
    }

    public void setIsBugOpen(boolean setIsBugOpen) {
        this.isBugOpen = setIsBugOpen;
    }

    public void bugDetails() {
        if (this.isBugOpen) {
            System.out.println(description + " is a bug opened by " + this.creatorsEmail + " the status of the bug is "
                    +
                    "Open " + "with priorty " + this.priority + ".");
        } else {
            System.out.println(description + " is a bug opened by " + this.creatorsEmail + " the status of the bug is "
                    +
                    "Closed " + "with priorty " + this.priority + ".");

        }
    }
}
