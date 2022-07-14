interface Animal{
    public void walk();
}

class Horse implements Animal{
    public void walk(){
        System.out.println("horse walk on 4 legs");
    }
}
public class OOPS1 {
    public static void main(String args[]){
        Horse horse = new Horse();
        horse.walk();

    }
    
}
