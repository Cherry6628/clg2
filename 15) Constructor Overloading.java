class Shape {
    double length, breadth;

    Shape(double l, double b) {
        length = l;
        breadth = b;
    }

    Shape(double s) {
        length = breadth = s;
    }

    double calculate() {
        return length * breadth;
    }
}

class Box extends Shape {
    double height;

    Box(double l, double b, double h) {
        super(l, b);
        height = h;
    }

    Box(double s, double h) {
        super(s);
        height = h;
    }

    double calculate() {
        return length * breadth * height;
    }
}

public class Farm {
    public static void main(String[] args) {
        Shape rectangle = new Shape(10.0, 20.0);
        System.out.println("Area of rectangle: " + rectangle.calculate());

        Shape square = new Shape(5.0);
        System.out.println("Area of square: " + square.calculate());

        Box box = new Box(5.0, 10.0, 15.0);
        System.out.println("Volume of box: " + box.calculate());

        Box cube = new Box(5.0, 10.0);
        System.out.println("Volume of cube: " + cube.calculate());
    }
}
