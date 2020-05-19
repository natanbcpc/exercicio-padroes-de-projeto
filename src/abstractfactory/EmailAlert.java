package abstractfactory;

public class EmailAlert implements Alert {

    @Override
    public void notifyAlert() {
        System.out.println("Email");
    }
}
