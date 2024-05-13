package local.play.structural.proxy;

public class RealInternet implements Internet{
    public void connect(String host){
        System.out.println("Connecting..........");
        System.out.println("Connected to : " + host);
    }
    public void disconnect(){
        System.out.println("Disconnected");
    }
}
