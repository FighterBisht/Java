package javaPractice;

public class shape {
    public void area(){
        System.out.println("display area");
    }    
}
class Triangle extends shape{
    public void area(int l,int b){
        System.out.println((0.5)*l*h);
    }
}
class Circle extends shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}

class Main{
    public static void main(String[] args){
        Triangle s1 = new Triangle();
        s1.area(2,2);
        Circle c1 = new Circle();
        c1.area(2);
    }
}



