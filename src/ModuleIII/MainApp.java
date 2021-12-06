package ModuleIII;

import AccessTestPackage.Bug2;

public class MainApp {
    public static void main(String[] args) {
        Bug2 bugger = new Bug2("Timeout during log in", "test@test.com", 1);
        System.out.println(bugger.getDescription());
        System.out.println(bugger.getCreatorsEmail());
        System.out.println(bugger.getPriority());

        bugger.setDescription("this is a longer descriptio");
        System.out.println(bugger.getDescription());

        bugger.setCreatorsEmail("2@2.pl");
        System.out.println(bugger.getCreatorsEmail());
        bugger.setPriority(3);
        System.out.println(bugger.getPriority());
    }
}
