package OOPS;

abstract class Animal{
    abstract void walk() ;
    public void eat(){
        System.out.println("Eats food");
    }
    Animal(){
        System.out.println("You are creating a new Animal");
    }
}

class Horse extends Animal{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
    Horse(){
        System.out.println("You are creating a new Horse");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walk on 2 legs");
    }
}

public class AbstractionOOP {
    public static void main(String[] args) {
        Horse h1 = new Horse(); // when horse constructor is called it will first run the animal constructor beacuse of inheritance 
        // h1.walk();
        // h1.eat(); // because of inheritance 
    }
}
