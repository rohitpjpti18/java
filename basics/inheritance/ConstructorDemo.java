// Demonstrate when constructors are called.

// Create a super class.
class Alpha{
    Alpha(){
        System.out.println("Inside Alpha's constructor.");
    }
}

// Create a subclass by extending class A.
class Beta extends Alpha {
    Beta() {
        System.out.println("Inside Beta's constructor.");
    }
}
    // Create another subclass by extending B.
class Gamma extends Beta {
    Gamma() {
        System.out.println("Inside Gamma's constructor.");
    }
}


class ConstructorDemo{
    public static void main(String[] args) {
        Gamma g = new Gamma();
    }
}