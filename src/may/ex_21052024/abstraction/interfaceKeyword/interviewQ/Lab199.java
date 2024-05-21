package src.may.ex_21052024.abstraction.interfaceKeyword.interviewQ;

public class Lab199 {

}
interface I1{


}
interface I2{}
class A{}
class B{}
abstract class C{}
class Test1 extends A{} // Ok or Not Ok? - Single Inherintance.
class Test2 extends B{}
// class Test3 extends A,B{} - Multiple Inheritance (with Class Not allowed)
class Test4 implements I1,I2{} // Multiple Inherintance
class Test5 extends A implements I1,I2{}
// class Test6 implements I1 extends A{} - Not OK
//interface I3 extends A{}
//interface I4 implements A{}
//interface I5 extends A,B{}
interface I6 extends I1,I2{}
//interface I7  extends C{}