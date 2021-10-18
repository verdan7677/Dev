public class polymorphism{
public static void main(String[] args){
        A clas = new B();
        clas.run();
    }
}

class A {
    public  void run(){
        System.out.println("run!!");
    }
}

class B extends A{
    public  void run(){
        System.out.println("run");
    }
}