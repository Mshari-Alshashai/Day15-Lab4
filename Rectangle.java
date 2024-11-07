import java.text.DecimalFormat;

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
    public void calculateArea() {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println((df.format(height*width)));
    }

    @Override
    public void calculateCircumference() {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println((df.format(((2*height)+(2*width)))));
    }
}
