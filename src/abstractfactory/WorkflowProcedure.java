package abstractfactory;

import listeners.EventListener;

public class WorkflowProcedure implements Procedure, EventListener {

    @Override
    public void startProcedure(String event) {
        System.out.println("Workflow: " + event);
    }
}
