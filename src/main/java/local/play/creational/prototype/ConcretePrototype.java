package local.play.creational.prototype;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
@Data
public class ConcretePrototype implements Prototype{

    private int id;

    List<Integer> arr;

    public ConcretePrototype(){};

    public Prototype clone(){
        ConcretePrototype clone = new ConcretePrototype();
        clone.setId(this.id);
        clone.arr = new ArrayList<>(this.arr);
        return clone;
    };
    
}
