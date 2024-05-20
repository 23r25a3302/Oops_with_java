public class ThisMethod {
    public static void main(String args[]) {
        AnyMet a = new AnyMet(10);

    }
}
class AnyMet {
    AnyMet() {
        System.out.println("Hello ottMet");
    }
    AnyMet(int x) {
        this();
        System.out.println(x);
    }
}
