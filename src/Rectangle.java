
public class Rectangle implements Sortable<Rectangle>{
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
    public boolean isBigger(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.area() > rectangle2.area();
    }
}
