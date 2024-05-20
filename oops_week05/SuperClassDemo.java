public class SuperClassDemo {
    public static void main(String args[]) {
        Pet p = new Pet();
        p.printColor();
    }
}
// parent class
class Animals {
    String color = "White";
}
// child class
class Pet extends Animals {
    String color = "Black";
    void printColor() {
        System.out.println(color);
        System.out.println(super.color);
    }
}
