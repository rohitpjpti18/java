// A simple demonstration of abstract
abstract class AD{
    abstract void callme();

    void callmetoo(){
        System.out.println("This is a concrete method.");
    }
}

class BD extends AD{
    void callme(){
        System.out.println("B's implementation of callme.");
    }
}

public class AbrstractDemo {
    public static void main(String args[]){
        BD b = new BD();

        b.callme();
        b.callmetoo();
    }
}