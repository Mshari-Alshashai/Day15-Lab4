public class Rectangle extends Shape{

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {}

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
       if(height>=0)this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width>=0)this.width = width;
    }

    @Override
    public double calculateArea() {
        return height*width;
    }

    @Override
    public double calculateCircumference() {
        return ((2*height)+(2*width));
    }
}
