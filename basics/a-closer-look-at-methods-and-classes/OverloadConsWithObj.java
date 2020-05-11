class Box {
    double width;
    double height;
    double depth;

    // Notice this constructor. It takes an object of type box.
    Box(Box ob) {
        this.width = ob.width;
        this.height = ob.height;
        this.depth = ob.depth;
    }

    Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    Box() {
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }

    // constructor used when cube is created
    Box(double len){
        this.width = this.height = this.depth = len;
    }

    // compute and return volume 
    double volume() {
        return width * height * depth;
    }
}


public class OverloadConsWithObj {
    public static void main(String[] args){
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        Box myclone = new Box(mybox1);

        double vol;

        vol = mybox1.volume();
        System.out.println("volume of mybox1 is " + vol);

        vol = mybox2.volume();
        System.out.println("volume is mybox2 is " + vol);

        vol = mycube.volume();
        System.out.println("volume is cube is " + vol);

        vol = myclone.volume();
        System.out.println("volume is clone is " + vol);
    }
}