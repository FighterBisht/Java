class Constructor{
    String name;
    int age;

    Constructor(){
        System.out.println("Constructor called");
    }

    void sushil(){
        System.out.println("I am Sushil Bisht");
    }
    public static void main(String[] args){
        Constructor obj = new Constructor();
        obj.sushil();
    }
}