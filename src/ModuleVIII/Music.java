package ModuleVIII;

public interface Music {
     String NAME = "MUSIC";

     void playMusic();
     void pauseMusic();
     void stopMusic();

     default void hello(){
         System.out.println("Hello");
     }

     static String getName(){
         return NAME;
     }

     private static void privateMthod(){
         System.out.println("Hello private");
     }
}
