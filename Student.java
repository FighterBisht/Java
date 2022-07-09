class Hello{
    String name;
    int age;

    void getInfo(){
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }
}


public class Student{
    public static void main(String[] args){
        Hello h1 = new Hello();
        h1.name = "Naveen";
        h1.age = 21;
        h1.getInfo();

        Hello h2 = new Hello();
        h2.name = "Sushil";
        h2.age = 21;
        h2.getInfo();

        Hello h3 = new Hello();
        h3.name = "karan";
        h3.age = 18;
        h3.getInfo();
    }
}