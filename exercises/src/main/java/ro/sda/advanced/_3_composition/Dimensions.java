package ro.sda.advanced._3_composition;
//* Create a class named Dimensions with the following instance variables: width, height, depth
// * The class should contain getters for all the fields.
public class Dimensions {
    private double width;
    private double height;
    private double depth;

    public Dimensions(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }
}
