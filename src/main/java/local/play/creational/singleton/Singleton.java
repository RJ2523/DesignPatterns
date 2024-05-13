package local.play.creational.singleton;

import lombok.Data;

@Data
public class Singleton {
    
    // will not have getters and setters for this field for various reasons
    // to maintain global state
    private static Singleton singleton = null;
    
    private int x = 2;

    private Singleton(){
    }

    public static Singleton getInstane(){
        if(singleton==null){
            System.out.println("Singleton Object created");
            singleton = new Singleton();
        }
        return singleton;
    }
}
