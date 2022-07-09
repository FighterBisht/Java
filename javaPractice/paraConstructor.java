package javaPractice;

public class paraConstructor {
    //data member
    String name;
    int age;

    paraConstructor(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("the name is "+ name);
        System.out.println("the age is "+ age);
    }
    public static void main(String args[]) {
        paraConstructor obj = new paraConstructor("sushil",21);

        
    }
}
