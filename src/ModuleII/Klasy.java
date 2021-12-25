package ModuleII;

public class Klasy {

    public static void main(String[] args) {
        User user = new User("Tom", "1@me.pl", 17);
        Bug bugger = new Bug("System is crashing", 1, user);

        System.out.println(user.getEmail());
        bugger.byWhomCreated();
        System.out.println("The priority of the bug is " + bugger.getBugPriority());

        System.out.println(bugger);
        bugger.setIsBugOpen(false);
        System.out.println(bugger);
    }
}
