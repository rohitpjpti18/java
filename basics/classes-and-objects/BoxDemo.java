

class Box {
    double width;
    double height;
    double depth;


    Box() {
        System.out.println("Constructing Box");
        this.width = 10;
        this.height = 10;
        this.depth = 10;
    }

    Box(double s) {
        this.width = s;
        this.height = s;
        this.depth = s;
    }

    Box(double w, double h, double d){
        this.width = w;
        this.height = h;
        this.depth = d;
    }


    double volume() {
        return width * height * depth;
    }
}


class BoxDemo {
    public static void main(String args[]) {
        Box mybox = new Box();



        System.out.println(mybox.volume());
    }
}