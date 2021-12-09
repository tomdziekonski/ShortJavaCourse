package ModuleIV;

import java.util.ArrayList;
import java.util.Collections;

public class ZadanieIV {
    public static void main(String[] args) {
        int [] numbers = {2, 4, 1, 9, 5, 2, 4, 0, 5,8};
        ArrayList<Integer> list = new ArrayList<>();

        for (int i: numbers){
        list.add(i);
        }

        Collections.sort(list);
        for(int i: list){
            System.out.println(i);
        }
    }
}
