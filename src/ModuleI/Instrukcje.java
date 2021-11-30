package ModuleI;

public class Instrukcje {
    public static void main(String[] args) {
        int numberA = 5;
        int numberB = 11;

        if (numberA > numberB) {
            System.out.println("Number A is larger than number B");
        } else {
            System.out.println("Number B is larger than number A");
        }


        String loginPage = "Login";
        String LogoutPage = "Logout";

        String page = loginPage;

        switch (page) {
            case "Login":
                System.out.println("Open Login page");
                break;
            case "Logout":
                System.out.println("Open Logout page");
                break;
            default:
                System.out.println("Unknown page");
        }

        if (5 % 5 == 0){
            System.out.println("It is an even number");
        }

        else {
            System.out.println("It is not an even number");

        }

    }}

