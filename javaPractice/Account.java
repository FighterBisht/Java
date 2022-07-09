package javaPractice;

class hello {
    public String name;
    protected String email;
    private String password;

    public void setPassword(String password){
        this.password = password;
        System.out.println(name);
        System.out.println(email);
        System.out.println(password);
    }
}
public class Account{
    public static void main(String args[]){
        hello a1 = new hello();
        a1.email = "abc@gmail.com";
        a1.name = "sushil";
        a1.setPassword("abcd");
    }
}


