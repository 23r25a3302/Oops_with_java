import java.util.Scanner;

public class AbstractShape {
    public static void main(String args[]) {
        Shape s1 = new Rectangle();
        Shape s2 = new Circle();
        s1.printArea();
        s2.printArea();
    }
}
// abstract class
abstract class Shape {
    double l,b,r;
    Scanner in = new Scanner(System.in);
    abstract void printArea();
}
// rectangle
class Rectangle extends Shape {
    void printArea() {
        System.out.println("enter length and breadth : ");
        l = in.nextDouble();
        b = in.nextDouble();
        System.out.println("Area : "+(l*b));
    }
}
// circle
class Circle extends Shape {
    void printArea() {
        System.out.println("enter radius of circle : ");
        r =in.nextDouble();
        System.out.println("Area "+(2*3.14*r));
    }
}



