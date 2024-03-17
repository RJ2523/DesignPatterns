package local.play;

import java.util.ArrayList;
import java.util.List;

import local.play.prototype.ConcretePrototype;
import local.play.singleton.Singleton;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){

        Singleton singleton = Singleton.getInstane();
        System.out.println(singleton.getX());
        Singleton singleton2 = Singleton.getInstane();
        System.out.println(singleton2.getX());

    }
}
