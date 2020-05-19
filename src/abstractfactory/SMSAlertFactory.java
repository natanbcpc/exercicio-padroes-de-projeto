package abstractfactory;

public class SMSAlertFactory implements AlertAbstractFactory<SMSAlert> {
    @Override
    public SMSAlert createAlert() {
        return new SMSAlert();
    }
}
