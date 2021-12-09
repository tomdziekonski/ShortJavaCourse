package ModuleIV;

public class ZadanieII {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};

        number[4] = number[0] + number[4];
        number[0] = number[4] - number[0];
        number[4] = number[4] - number[0];

        int container = number[0];

        for (int i = 0; i < number.length; i++) {
            if (i == 0) {
                number[0] = number[number.length - 1];
            } else if (i == number.length - 1) {
                number[number.length - 1] = container;
            }
        }



        for (int i : number) {
            System.out.println(i);
        }
    }
}
