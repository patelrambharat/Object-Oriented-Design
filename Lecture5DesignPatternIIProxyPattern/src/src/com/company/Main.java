package src.com.company;

public class Main {

    public static void main(String[] args) {
        OfficeInternetAccess access = new ProxyInternetAccess("Bharat Patel");
        access.grantInternetAccess();
    }
}
