package abstractfactory;

public class SMSProcedureProcedureFactory implements ProcedureAbstractFactory<SMSAlertProcedure> {
    @Override
    public SMSAlertProcedure createProcedure() {
        return new SMSAlertProcedure();
    }
}
