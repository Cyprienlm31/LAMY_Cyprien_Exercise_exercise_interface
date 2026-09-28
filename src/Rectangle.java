
public class Rectangle implements Comparable<Rectangle>{
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double area() {
        return height*width;
    }

    @Override
    public int compareTo( Rectangle otherRectangle) {
        return (int) (this.area() - otherRectangle.area());
    }
}
