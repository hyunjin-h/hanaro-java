//중첩 클래스 : 클래스 안에 클래스가 들어가는 것
//외부(Outer) 클래스 : 클래스 밖에 클래스를 선언
//내부(Inner) 클래스 : 클래스 안에 클래스를 선언
//내부 클래스를 사용하는 이유
//   : 내부적으로 소비하는 끝나는 클래스는 내부클래스로 선언한다.
class Outer {
    String name = "outer";
    class Inner {
        String name = "inner";
    }
    static class InnerStatic{
        String name = "inner static";
    }
}
public class ex50 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println( outer.name );
        //안되는 경우
        //Outer.Inner inner = new Outer.Inner();
        Outer.Inner inner = outer.new Inner();
        System.out.println( inner.name );
        //inner클래스를 static으로 선언하면 좀더 편하게 선언 가능
        Outer.InnerStatic innerStatic = new Outer.InnerStatic();
        System.out.println( innerStatic.name );
    }
}
