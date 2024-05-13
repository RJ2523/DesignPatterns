package local.play.creational.factory;

public class AnimalFactory{

    public Animal createAnimal(String animalType){

        if(("Dog").equals(animalType)){
            return new Dog();
        }else if(("Cat").equals(animalType))
            return new Cat();
        else
            throw new IllegalArgumentException();
    }
    
}
