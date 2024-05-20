public class AnimalDemo {
    public static  void main(String args[]) {
        Dogs d = new Dogs();
        d.dog();
        d.cat();
    }
}
// abstract class
abstract class Animal {
    abstract void cat();
    abstract void dog();
}
// cat class
abstract class Cats extends Animal {
    void cat() {
        System.out.println("Cat meows !");
    }
}
class Dogs extends Cats {
    void dog() {
        System.out.println("Dog barks !");
    }
}
