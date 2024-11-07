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
    public double calculateArea() {
        return (0.5*base*height);
    }

    @Override
    public double calculateCircumference() {
        return base*3;
    }
}
