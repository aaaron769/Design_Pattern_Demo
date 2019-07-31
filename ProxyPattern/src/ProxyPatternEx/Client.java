package ProxyPatternEx;

public class Client {
    public static void  main(String args[]){
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("geeksForGeeks.org");
            internet.connectTo("abc.com");
            internet.connectTo("Inm.com");
        }catch (Exception e){
           System.out.println(e.getMessage());
        }
    }
}
