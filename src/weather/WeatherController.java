package weather;

import observers.EventManager;

import static weather.Priority.HIGH;
import static weather.Priority.LOW;

public class WeatherController {

    private EventManager eventManager;

    public WeatherController(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    public void updateWeather(float temperature, float humidity) {
        if (temperature > 50 || temperature < -10 || humidity > 0.9 || humidity < 0.5) {
            eventManager.notify(HIGH, "Event");
        } else if (temperature > 40 || temperature < 0 || humidity > 0.8 || humidity < 0.6) {
            eventManager.notify(LOW, "Event");
        }
    }
}
