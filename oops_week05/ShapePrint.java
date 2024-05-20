public class ShapePrint {
    public static void main(String args[]) {
        ShapePar s1 = new RectangleShape();
        ShapePar s2 = new CircleShape();
        ShapePar s3 = new SquareShape();
        s1.print();
        s2.print();
        s3.print();
    }
}
// parent class
class ShapePar {
    void print() {
        System.out.println("This is Shape");
    }
}
// sub_class rectangle
class RectangleShape extends ShapePar {
    @Override
    void print() {
        System.out.println("This is Rectangle shape");
    }
}
//sub_class circle
class CircleShape extends ShapePar {
    @Override
    void print() {
        System.out.println("This is Circle shape");
    }
}
// sub_class square
class SquareShape extends ShapePar {
    @Override
    void print() {
        System.out.println("This is Square shape");
    }
}
