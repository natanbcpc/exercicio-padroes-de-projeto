package abstractfactory;

public class EmailAlertFactory implements AlertAbstractFactory<EmailAlert> {
    @Override
    public EmailAlert createAlert() {
        return new EmailAlert();
    }
}
