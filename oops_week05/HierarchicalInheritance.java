public class HierarchicalInheritance {
    public static void main(String args[]) {
        SubClass1 s1 = new SubClass1();
        SubClass2 s2 = new SubClass2();
        s1.setData(100);
        s1.displayData();
        s2.setData(200);
        s2.displayData();
    }
}
// parent class
class Parent {
    int a;
    void setData(int a) {
        this.a = a;
    }
}
// sub_class1
class SubClass1 extends Parent {
    void displayData() {
        System.out.println("a : "+a+" sub class 1");
    }
}
class SubClass2 extends Parent {
    void displayData() {
        System.out.println("a : "+a+" sub class 2");
    }
}
