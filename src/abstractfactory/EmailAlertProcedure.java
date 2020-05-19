package abstractfactory;

import listeners.EventListener;

public class EmailAlertProcedure implements Procedure, EventListener {

    @Override
    public void startProcedure(String event) {
        System.out.println("Email: " + event);
    }
}
