package abstractfactory;

public class SMSAlert implements Alert {

    @Override
    public void notifyAlert() {
        System.out.println("SMS");
    }
}
