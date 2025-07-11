class Demo{
    int a=7;
    int b=7 ;
    static int c=8;

    public static void demo()
    {
        System.out.println("Hello World");
    }
    static{
        c=9;
        System.out.println("In Static Block");
    }

}
public class Statix {
    
    public static void main(String[] args)
    {
       Demo.c=9;
       Demo.demo();
    
    }
}
