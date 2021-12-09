package ModuleIV;

public class ZadanieI {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5};

        int container2 = numbers [4];
        int container = numbers[0];

        numbers[0] = container2;
        numbers[4] = container;

        for (int i: numbers) {
            System.out.println(i);
        }

    }


}
