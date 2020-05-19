import abstractfactory.EmailProcedureProcedureFactory;
import abstractfactory.SMSProcedureProcedureFactory;
import abstractfactory.WorkflowProcedureFactory;
import observers.EventManager;
import weather.WeatherController;

import static weather.Priority.HIGH;
import static weather.Priority.LOW;

public class Application {

    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        eventManager.subscribe(LOW, new EmailProcedureProcedureFactory().createProcedure());
        eventManager.subscribe(LOW, new SMSProcedureProcedureFactory().createProcedure());
        eventManager.subscribe(HIGH, new WorkflowProcedureFactory().createProcedure());

        WeatherController weatherController = new WeatherController(eventManager);
        weatherController.updateWeather(60, 50);
        weatherController.updateWeather(50, 70);
    }
}
