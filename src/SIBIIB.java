class A
{
    static int i = 1111;
 
    static
    {
        i = i-- - --i;
    }
 
    {
        i = i++ + ++i;
    }
    void method(int i) {
    	System.out.println("class A");
	}
}
 
class B extends A
{
    static
    {
        i = --i - i--;
    }
 
    {
        i = ++i + i++;
    }
    void method(Integer i) {
    	System.out.println("class B");
	}
}
public class SIBIIB {
	
	void method(int i) {
		System.out.println("int class sib");
	}
	void method(Integer i) {
		System.out.println("Integer class sib");
	}
	void method(String i) {
		System.out.println("string class sib");
	}
	
	static int methodOne(int i)
    {
        return methodTwo(i *= 11);
    }
 
    static int methodTwo(int i)
    {
        return methodThree(i /= 11);
    }
 
    static int methodThree(int i)
    {
        return methodFour(i -= 11);
    }
 
    static int methodFour(int i)
    {
        return i += 11;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		int a1 = 2;
		Integer a2 = 3;
		 b.method(a1);
		 b.method(a2);
        System.out.println(b.i);
        Integer i1= 129;
        Integer i2 = 129;
        System.out.println(i1==i2);
        Integer i3= 128;
        Integer i4 = 128;
        System.out.println(i3==i4);
        SIBIIB sb = new SIBIIB();
      //  sb.method(null);
        System.out.println(methodOne(11));
        int ab = 10 + + 11 - - 12 + + 13 - - 14 + + 15;
        
        System.out.println("ab  : " + ab);
	}

}
