abstract class Parent{
    private int a=7;
    public int b=8;
    protected int c=9;


    abstract void def();

   final void abc(int a)
    {
        System.out.println("Value of A is:"+a);
    }
}

abstract class Child extends Parent{

    final void abc()
    {
        System.out.println("Welcome to Method overriding");
    }
}

class SecondChild extends Child{

    void def()
    {
        
    }
    void abc(int a,int b)
    {
        System.out.println("Welcome to Multilevel Inheritance");
    }

}

public class Inheritance {
    public static void main(String[] args)
    {
        SecondChild SecondChild=new SecondChild();
        // SecondChild.abc();
        SecondChild.abc(5);
        SecondChild.abc(5,6);
        
    }
}
