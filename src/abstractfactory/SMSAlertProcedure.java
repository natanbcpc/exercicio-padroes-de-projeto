package abstractfactory;

import listeners.EventListener;

public class SMSAlertProcedure implements Procedure, EventListener {

    @Override
    public void startProcedure(String event) {
        System.out.println("SMS: " + event);
    }
}
