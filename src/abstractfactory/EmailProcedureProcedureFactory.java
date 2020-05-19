package abstractfactory;

public class EmailProcedureProcedureFactory implements ProcedureAbstractFactory<EmailAlertProcedure> {
    @Override
    public EmailAlertProcedure createProcedure() {
        return new EmailAlertProcedure();
    }
}
