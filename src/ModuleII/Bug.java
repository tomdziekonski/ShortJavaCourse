package ModuleII;

public class Bug implements ConsoleNotification {
    private String description;
    private int priority;
    private boolean isBugOpen;
    private User user;

    public Bug(String description, int priority, User user) {
        if (priority < 1 || priority > 5) {
            System.out.println("Error during bug creation, invalid priority parameter, provide a priority in range 1-5");
        } else {
            this.description = description;
            this.priority = priority;
            this.isBugOpen = true;
            this.user = user;
        }
    }

    public void byWhomCreated() {
        System.out.println("Bug created by " + user.getEmail());
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
        notifyStatusChange();
    }

    public void bugDetails() {
        if (this.isBugOpen) {
            System.out.println(description + " is a bug opened by " + this.user.getEmail() + " the status of the bug is "
                    +
                    "Open " + "with priorty " + this.priority + ".");
        } else {
            System.out.println(description + " is a bug opened by " + this.user.getEmail() + " the status of the bug is "
                    +
                    "Closed " + "with priorty " + this.priority + ".");
        }
    }

    @Override
    public String toString() {
        return "Bug " + description + " was crated by:" + "\n" +
                this.user.getEmail() + "\n" +
                "with priority " + priority +
                " and the status is " + isBugOpen +
                "\n" + this.user;
    }
}
