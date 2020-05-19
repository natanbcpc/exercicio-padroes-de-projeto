package abstractfactory;

public interface ProcedureAbstractFactory<T extends Procedure> {
    T createProcedure();
}
