package ModuleIV;

public class ZadanieV {
    public static void main(String[] args) {
        int [] numbers = {2, 4, 1, 9, 5, 2, 4, 0, 5,8};
        int minimum;

        for (int i = 0; i<numbers.length; i++){
             minimum = numbers[i];
            for (int j= i +1; j < numbers.length;j++){
                if (numbers[j] < minimum){
                    minimum = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = minimum;
                }
            }
        }
        for(int i: numbers){
            System.out.println(i);
        }
    }
}
