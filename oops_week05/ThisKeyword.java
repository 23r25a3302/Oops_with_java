public class ThisKeyword {
    public static void main(String args[]) {
        Any a = new Any();
        a.ott2();
    }
}
// using of keyword
class Any {
    void ott() {
        System.out.println("This is OTT");
    }
    void ott2() {
        System.out.println("This is OTT movie");
        this.ott();
    }
}
