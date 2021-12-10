package ModuleV;

public class DoWhile {
    public static void main(String[] args) {
        int number = 10;

        do{
            System.out.println(number);
            number++;
        }
        while(number > 25);

        System.out.println(StringUtil.getText("test"));
        System.out.println(StringUtil.getText("testtestesttes"));
        System.out.println(WeekUtil.MONDAY);
    }

    }
