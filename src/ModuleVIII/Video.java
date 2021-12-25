package ModuleVIII;

public interface Video {
    void playVideo();
    void stopVideo();
    void pauseVideo();

    default void helloVideo(){
        System.out.println("Hello Video");
    }

}
