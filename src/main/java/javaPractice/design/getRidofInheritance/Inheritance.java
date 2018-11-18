package javaPractice.design.getRidofInheritance;

class A{
    public void f1() {}
    
    public void f2() {}
}

//by extending we can use f1 and f2 with B as well
//but, any where A can be used, we can use B As well, and we do not have that requirment
//inhertance is not the choice here, we need a better solution.
class B extends A{
    
    public void f3() {}
}

public class Inheritance {
    public static void main() {
	System.out.println("OK");
    }
}
