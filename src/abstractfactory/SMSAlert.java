package abstractfactory;

import listeners.EventListener;

public class SMSAlert implements Alert, EventListener {

    @Override
    public void notifyAlert(String message) {
        System.out.println("SMS");
    }

    @Override
    public void createAlert(String message) {
        notifyAlert(message);
    }
}
