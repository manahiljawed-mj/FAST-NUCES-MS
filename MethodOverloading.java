class Method{
    int a;
    int b;

    Method()
    {
        System.out.println("Object Created");
    }
    Method(int a,int b)
    {
        this.a=a;
        this.b=b;
        System.out.println("Second Object is Created");
    }
    void valueFetch(int a,int b){
        this.a=a;
        this.b=b;
    }

    void valueFetch(int a)
    {
        this.a=a;
    }
}

public class MethodOverloading {
    public static void main(String a[])
    {
        Method method=new Method();
        method.valueFetch(1);
        new Method(7,6).valueFetch(7);//Anonymous Object 

    }
}
