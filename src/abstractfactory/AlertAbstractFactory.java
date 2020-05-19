package abstractfactory;

public interface AlertAbstractFactory<T extends Alert> {
    T createAlert();
}
