package local.play;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import local.play.creational.factory.Animal;
import local.play.creational.factory.AnimalFactory;
import local.play.creational.factory.Cat;
import local.play.creational.factory.Dog;
import local.play.creational.prototype.ConcretePrototype;
import local.play.creational.singleton.Singleton;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        String requirment = "Cat";
        AnimalFactory animalFactory = new AnimalFactory();
        Cat cat = (Cat) animalFactory.createAnimal(requirment);
        cat.speak();;
    }   
}
