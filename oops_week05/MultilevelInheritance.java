public class MultilevelInheritance {
    public static void main(String args[]) {
        ChildClass2 c = new ChildClass2();
        c.a = 10;
        c.b = 15;
        c.c = 20;
        System.out.println("a : "+c.a+ " b : "+c.b+" c : "+c.c);
        c.setData();
        c.setData1();
        c.setData2();
    }
}
//multi level inheritance
//Super class
class SuperClass {
    int a;
    void setData() {
        System.out.println("I am a Super class");
    }
}
// sub_class 1
class ChildClass1 extends SuperClass {
    int b;
    void setData1() {
        System.out.println("I am a Child class 1");
    }
}
// sub_class 2
class ChildClass2 extends ChildClass1 {
    int c;
    void setData2() {
        System.out.println("I am a child class 2");
    }
}
