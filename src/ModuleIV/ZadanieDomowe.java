package ModuleIV;

public class ZadanieDomowe {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 1, 9, 5, 2, 4, 0, 5, 8};
        int maximum;

        for (int i = 0; i < numbers.length; i++) {
            maximum = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > maximum) {
                    maximum = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = maximum;
                }
            }
        }

        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
