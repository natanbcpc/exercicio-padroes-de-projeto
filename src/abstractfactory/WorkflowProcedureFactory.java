package abstractfactory;

public class WorkflowProcedureFactory implements ProcedureAbstractFactory<WorkflowProcedure> {
    @Override
    public WorkflowProcedure createProcedure() {
        return new WorkflowProcedure();
    }
}
