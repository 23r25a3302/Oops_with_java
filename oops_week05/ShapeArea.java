import java.util.*;
public class ShapeArea {
    public static void main(String args[]) {
        ShapeParent s1 = new RectangleArea();
        ShapeParent s2 = new CircleArea();
        ShapeParent s3 = new TriangleArea();
        s1.printArea();
        s2.printArea();
        s3.printArea();
    }
}
// abstract class
abstract class ShapeParent {
    double l,b,r,h,w;
    Scanner in = new Scanner(System.in);
    abstract void printArea();
}
// sub_class of rectangle
class RectangleArea extends ShapeParent {
    void printArea() {
        System.out.println("enter length and breadth : ");
        l = in.nextDouble();
        b = in.nextDouble();
        System.out.println("Rectangle Area : "+(l*b));
    }
}
// sub_class for circle
class CircleArea extends ShapeParent {
    void printArea() {
        System.out.println("enter radius : ");
        r = in.nextDouble();
        System.out.println("Circle Area : "+(2*3.14*r));
    }
}
// sub_class for triangle
class TriangleArea extends ShapeParent {
    void printArea() {
        System.out.println("enter base and height : ");
        w = in.nextDouble();
        h = in.nextDouble();
        System.out.println("Triangle Area : "+(0.5*w*h));
    }
}

