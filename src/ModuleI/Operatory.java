package ModuleI;

public class Operatory {
    public static void main(String[] args) {
        int numberA = 5;
        int numberB = 5;

        System.out.println(numberA + numberB);
        System.out.println(numberA - numberB);
        System.out.println(numberA * numberB);
        System.out.println((double) numberA / numberB);

        System.out.println(numberA == numberB);
        System.out.println(numberA != numberB);

        System.out.println(numberA == numberB || numberB - numberA == 1);
        System.out.println(numberA != numberB || numberB - numberA == 1);

        System.out.println(numberA == numberB && numberB - numberA == 0);
        System.out.println(numberA != numberB && numberB - numberA == 1);

    }
}
