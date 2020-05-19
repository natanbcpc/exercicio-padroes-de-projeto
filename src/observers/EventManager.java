package observers;

import listeners.EventListener;
import weather.Priority;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static weather.Priority.HIGH;
import static weather.Priority.LOW;

public class EventManager {
    Map<Priority, List<EventListener>> listeners;

    public EventManager() {
        this.listeners = new HashMap<>();
        this.listeners.put(LOW, new ArrayList<>());
        this.listeners.put(HIGH, new ArrayList<>());
    }

    public void subscribe(Priority priority, EventListener listener) {
        listeners.get(priority).add(listener);
    }

    public void unsubscribe(Priority priority, EventListener listener) {
        listeners.get(priority).remove(listener);
    }

    public void notify(Priority priority, String event) {
        for (EventListener listener : listeners.get(priority)) {
            listener.startProcedure(event);
        }
    }
}