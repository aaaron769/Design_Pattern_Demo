package ProxyPatternEx;

public class RealInternet implements Internet {
    @Override
    public void connectTo(String serverHost) throws Exception {
        System.out.println("connection to  "+serverHost);
    }
}
