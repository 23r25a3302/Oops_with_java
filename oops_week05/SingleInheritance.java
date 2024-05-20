public class SingleInheritance {
    public static void main(String args[]) {
        DogClass d = new DogClass();
        d.dog();
        d.setName();
    }
}
// parent class
class AnimalClass {
    void setName() {
        System.out.println("This is Animal or Parent class");
    }
}
class DogClass extends AnimalClass {
    void dog() {
        System.out.println("This is dog or child class");
    }
}
