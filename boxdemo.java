package test;

class Box {
    double width;
    double height;
    double depth;
}

class boxdemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        // Assign values to mybox's fields
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        // Compute volume
        vol = mybox.width * mybox.height * mybox.depth;

        // Display volume
        System.out.println("Volume is " + vol);
    }
}

