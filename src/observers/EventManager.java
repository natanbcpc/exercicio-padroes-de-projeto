package observers;

import listeners.EventListener;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    List<EventListener> listeners = new ArrayList<>();

    public void subscribe(EventListener listener) {
        listeners.add(listener);
    }

    public void unsubscribe(EventListener listener) {
        listeners.remove(listener);
    }

    public void notify(String message) {
        for (EventListener listener : listeners) {
            listener.notifyAlert(message);
        }
    }
}