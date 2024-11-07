import java.text.DecimalFormat;

public class Circle extends Shape{

    private double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius>=0)this.radius = radius;
    }

    @Override
    public void calculateArea() {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println((df.format(Math.PI*(radius*radius))));
    }

    @Override
    public void calculateCircumference() {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println((df.format(2*Math.PI*radius)));
    }
}
