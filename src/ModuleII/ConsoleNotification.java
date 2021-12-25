package ModuleII;

public interface ConsoleNotification {

    default void notifyStatusChange() {
        System.out.println("Status changed");
    }
}
