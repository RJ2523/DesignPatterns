package local.play.creational.prototype;


// the classes who implement this interfaces needs a to provide a clone method to let other classes creates a copy of the original object.
// adv : 1) we don't need to know the implementation details of that class.
//       2) need to perform deep copy in order to create a clone without any link to existing one
public interface Prototype {
    
    Prototype clone();
}
