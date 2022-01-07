package ModuleXI;

public class Bug {
    private int priority;

    public Bug(int prio){
        this.priority = prio;
    }

    public void setBugPriority(int prio){
        if (prio >= 0 && prio <5){
            this.priority = prio;
        }
        else {
            throw new IllegalBugPriorityException("Wrong priority !");
        }
    }
}
