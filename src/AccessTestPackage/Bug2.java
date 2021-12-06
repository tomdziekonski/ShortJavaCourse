package AccessTestPackage;

public class Bug2 {

    private String description;
    private String creatorsEmail;
    private int priority;
    private boolean isBugOpen;

    public Bug2(String description, String creatorsEmail, int priority) {
        this.description = description;
        this.creatorsEmail = creatorsEmail;
        this.priority = priority;
        this.isBugOpen = true;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description.length() >= 10) {
            this.description = description;
        } else {
            System.out.println("Description is too short, 10 characters is the minimum");
        }
    }

    public String getCreatorsEmail() {
        return creatorsEmail;
    }

    public void setCreatorsEmail(String creatorsEmail) {
        if (creatorsEmail.contains("@")) {
            this.creatorsEmail = creatorsEmail;
        } else {
            System.out.println("Email is invalid");
        }
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        if (priority >= 1 && priority < 6) {
            this.priority = priority;
        } else {
            System.out.println("Priority has to be in the 1-5 range");
        }
    }

    public boolean isBugOpen() {
        return isBugOpen;
    }

    public void setBugOpen(boolean bugOpen) {
        isBugOpen = bugOpen;
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


