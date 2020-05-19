package abstractfactory;

import listeners.EventListener;

public class EmailAlert implements Alert, EventListener {

    @Override
    public void notifyAlert(String message) {
        System.out.println(message);
    }

    @Override
    public void createAlert(String message) {
        notifyAlert(message);
    }
}
