package day47_Abstraction;

public class OperaDriver extends RemoteWebDriver {


    @Override
    protected void get(String URL) {
        System.out.println("Opening "+URL+" in opera browser");
    }

    @Override
    public void quit() {
        System.out.println("Closing the opera browser");
    }
}
