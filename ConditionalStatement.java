public class ConditionalStatement {
    public static void main(String[] args) {
        int a=7;
        if(a==7)
        {
            System.out.println("Value of value 1 is:");
        }else if(a==8)
        {
            System.out.println("Value of value 2 is:");
        }
        else
        {
            System.out.println("Value of value 3 is:");
        }
        int b=a==7?7:8;
        System.out.println("Value of b is:"+b);

        int c=8;

        int cc=switch(c)
        {
            
            case 1: yield  6;
            case 2: yield 7;
            default:yield 8;
        };

        System.out.println("Value of cc is:"+cc);
    }
}
