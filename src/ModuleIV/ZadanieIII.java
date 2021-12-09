package ModuleIV;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ZadanieIII {
    public static void main(String[] args) {
        int [] numbers = {2, 2, 3, 4, 5, 7, 7, 7, 8, 8, 2};
        int even = 0;
        int odd = 0;

        ArrayList<Integer> evenList = new ArrayList<Integer>();
        ArrayList<Integer> oddList = new ArrayList<Integer>();

        for(int i = 0; i<numbers.length; i++){
            if (numbers[i]%2 == 0 && !evenList.contains(numbers[i])){
                even+=1;
                evenList.add(numbers[i]);
            }
            else if(numbers[i]%2 != 0 && (!oddList.contains(numbers[i]))){
                odd+=1;
                oddList.add(numbers[i]);

            }
        }

        System.out.println("There are " + even + " even and " + odd + " odd numbers. ");
    }
}
