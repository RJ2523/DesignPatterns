package local.play.proxy;

import java.util.HashMap;
import java.util.Map;
public class ProxyInternet implements Internet{
    private Map<String, Boolean> blockedIpMap = new HashMap<>();
    private Internet internet;

    public ProxyInternet(){
        //switch to default implementation
        this.internet = new RealInternet();
    }
    public ProxyInternet(Internet internet){
        this.internet = internet;
    }

    public void connect(String host){
        //checking the domain is blocked
        if(blockedIpMap.get(host)!=null)
            System.out.println("Can't connect to the website");
        else
            internet.connect(host);
    }
    public void disconnect(){
        System.out.println("Disconnected");
    }
    
}
//restricts access to original object by acting as a proxy
//helps us to maintain open/closed principle.
//can be used for multiple purposes - firewall, protection, caching, privacy.
