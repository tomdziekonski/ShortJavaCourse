package ModuleII;

public class Klasy {

    public static void main(String[] args) {

        Bug bugger = new Bug("System is crashing", "tester@about.pl", 1);
        bugger.setIsBugOpen(false);
        bugger.bugDetails();
        bugger.bugStatus();
        bugger.byWhomCreated();
        System.out.println("The priority of the bug is " + bugger.getBugPriority());

    }
}
