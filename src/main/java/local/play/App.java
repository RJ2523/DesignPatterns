package local.play;

import java.util.ArrayList;
import java.util.List;

import local.play.prototype.ConcretePrototype;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        ConcretePrototype concretePrototype = new ConcretePrototype();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        concretePrototype.setId(1);
        concretePrototype.setArr(list);

        ConcretePrototype con = (ConcretePrototype) concretePrototype.clone();
        System.out.println("Changing Array list value in clone object");
        con.getArr().set(0, 6);

        System.out.println("Checking if the original object is intact : "  +concretePrototype.getArr());
    }
}
