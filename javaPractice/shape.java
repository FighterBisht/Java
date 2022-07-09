package javaPractice;

public class shape {
    public void area(){
        System.out.println("display area");
    }    
}
class Triangle extends shape{
    public void area(int l,int b){
        System.out.println("child ");
    }
}
class Circle extends shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}

class Main{
    public static void main(String[] args){
        Triangle t1 = new Triangle();
        t1.area(2,2);
    }
}



