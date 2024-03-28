package local.play;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import local.play.prototype.ConcretePrototype;
import local.play.singleton.Singleton;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){

        // Singleton singleton = Singleton.getInstane();
        // System.out.println(singleton.getX());
        // Singleton singleton2 = Singleton.getInstane();
        // System.out.println(singleton2.getX());
    

        List<Integer> list = new ArrayList<>();
        list.add(0,3);
        System.out.println(list.get(0));
        
    }
}
