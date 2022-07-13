abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("animal eats");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("horse eats");
    }
    public void walk(){
        System.out.println("walk on 4 legs");
    }

    
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("walk on 2 legs");
    }
    
}
public class OOPS {
    public static void main(String args[]){
        Horse horse = new Horse();
        horse.walk();
    }
    
    
}
