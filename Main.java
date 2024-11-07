public class Main {
    public static void main(String[] args) {


        Rectangle r = new Rectangle(4.5,2.5);
        Circle c = new Circle(3);
        Triangle t = new Triangle(3.5,2);

        System.out.println("Rectangle: ");

        r.setHeight(5);
        r.setWidth(3);
        System.out.println("Height: "+r.getHeight()+"\tWidth: "+r.getWidth());

        System.out.println("===================================");

        System.out.println("Circle: ");

        c.setRadius(2);
        System.out.println("Radius: "+c.getRadius());

        System.out.println("===========================================");

        System.out.println("Triangle: ");

        t.setHeight(4);
        t.setBase(3);
        System.out.println("Height: "+t.getHeight()+"\tBase: "+t.getBase());

        System.out.println("===========================================");

        System.out.println("Areas: ");

        r.calculateArea();
        c.calculateArea();
        t.calculateArea();

        System.out.println("===========================================");

        System.out.println("Perimeter: ");
        r.calculateCircumference();
        c.calculateCircumference();
        t.calculateCircumference();

    }
}
