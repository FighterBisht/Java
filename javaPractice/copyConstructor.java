package javaPractice;


public class copyConstructor {
    String name;
    int age;

    copyConstructor(Hello s2){
        this.name = s2.name;
        this.age = s2.age;
        System.out.println("the name is "+ name);
        System.out.println("the age is "+ age);
    }
    public static void main(String args[]) {
        Hello s2 = new Hello();
        s2.name = "sushil";
        s2.age = 21;
        
        copyConstructor obj = new copyConstructor(s2);
        


        
    }

}
