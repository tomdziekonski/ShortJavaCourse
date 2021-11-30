package ModuleI;

public class ZadanieDomowe {
    public static void main(String[] args) {
        int numberA = 5;
        int numberB = 55;
        int numberC = 36;
        int numberD = 57;

        boolean firstSum;


        if ((numberA + numberB) % 2 == 0) {
            System.out.println("First sum is an even number");
            firstSum = true;
        }

        else {
            System.out.println("First sum is not an even number");
        }

        if ((numberC + numberD) % 2 == 0) {
            System.out.println("Second sum is an even number");
            firstSum = true;
        }

        else {
            System.out.println("Second sum is not an even number");
        }

        if ((numberA + numberB) % 2 == 0 && (numberC + numberD) == 0) {
            System.out.println("The result of both sums is an even number");
        }

        else {
            System.out.println("The result of both sums is not an even number");
        }


    }

}
