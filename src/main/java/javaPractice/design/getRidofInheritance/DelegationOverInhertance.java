package javaPractice.design.getRidofInheritance;

class AA{
    public void f1() {}
    
    public void f2() {}
}

//using delegation instead if inheritance
class BB {
    
    private final AA _a = new AA();
    
    public void f1() {
	_a.f1();
    }

    public void f2() {
	_a.f2();
    }

    public void f3() {}
}

//If we use inheritance in this case we violate LSP
//we are not using inheritance

//But we are violating two principals
// 1. DRY: duplicating methods f1, f2 in class AA and BB 
// 2. OCP: if i change the name in f1 in AA, have to change the name in BB as well

//Shoudl i violate LSP or DRY/OCP
//If i violate LSP, users of the classes will violate LSP as well. If i violate DRY/OCP, that's on me,
//users don't have to violate anything
//groovy example to solve this : https://youtu.be/llGgO74uXMI?t=7898
public class DelegationOverInhertance {
    
    public static void main() {
	System.out.println("OK");
    }

}
