package javaPractice;

public class polymorphism {
    String name;
    int age;

    public void printInfo(String name){
        System.out.println("the name of student is "+ name);
    }
    public void printInfo(String name,int age){
        System.out.println(name + " " + age);
    }
    public void printInfo(int age){
        System.out.println("the age is "+ age);
    }
    public static void main(String args[]){
        polymorphism p1 = new polymorphism();
        p1.printInfo(10);
        p1.printInfo("sushil",21);
        p1.printInfo(21);

    }
    
}
