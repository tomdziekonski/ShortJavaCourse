package ModuleIV;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tablice {
    public static void main(String[] args) throws FileNotFoundException {

        String [] array = new String[4];
        File plikWsadowy = new File("C:\\Users\\dziekonskit\\IdeaProjects\\Platny kurs\\src\\ModuleIV\\plik wsadowy.txt");
        Scanner scan = new Scanner(plikWsadowy);

        String iteration = null;
        int counter = 0;

        while(scan.hasNextLine()){
            iteration = scan.nextLine();
            array[counter] = iteration;
            counter++;
        }

        for(String i: array){
            System.out.println(i);
        }

        String splitMe = array[0];
        ArrayList <String> list = new ArrayList<>();


        String [] split = splitMe.split("o");

        for (String i: split){
            System.out.println(i);
        }

        for(int i=0; i<array.length;i++){
            list.add(array[i]);
        }

        for(String i: list){
            System.out.println(i);
        }
    }
}
