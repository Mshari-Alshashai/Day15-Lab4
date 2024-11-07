import java.text.DecimalFormat;

public class Triangle extends Shape{

    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public Triangle() {}

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
      if (height>=0) this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
       if (base>=0)this.base = base;
    }

    @Override
    public void calculateArea() {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println((df.format(0.5*base*height)));
    }

    @Override
    public void calculateCircumference() {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println((df.format(base*3)));
    }
}
