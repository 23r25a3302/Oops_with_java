public class BankDemo {
    public static void main(String args[]) {
        A a = new A();
        a.getBalance();
        B b = new B();
        b.getBalance();
        C c = new C();
        c.getBalance();
    }
}

// abstract class
abstract class Bank {
    abstract void getBalance();
}

// sub_class bank a
class A extends Bank {
    double balance = 100;
    void getBalance() {
        System.out.println("Balance : $"+balance);
    }
}

// sub_class bank b
class B extends Bank {
    double balance = 150;
    void getBalance() {
        System.out.println("Balance : $"+balance);
    }
}

// sub_class bank c
class C extends Bank {
    double balance = 200;
    void getBalance() {
        System.out.println("Balance : $"+balance);
    }
}
