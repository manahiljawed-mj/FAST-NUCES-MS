public class TypeConversionAndCasting {
    public static void main(String[] args) {
        byte value=127;
        short value1=value;  //Conversion

        short value2=126;
        byte value3=(byte)value2; //Casting

        value2=256;
        byte value4=(byte)value2; //Casting
//        256%256
       System.out.println("Value of value 4 is:"+value4);

       char alphabet='A';
       int value5=alphabet;
       System.out.println("Value of value 5 is:"+value5);


    //    Type Promotion

    byte value_1=12;
    byte value_2=50;
 
    int value_3=value_1*value_2;

    System.out.println("Value of Type Promotion - value_3 is:"+value_3);


    }
}
