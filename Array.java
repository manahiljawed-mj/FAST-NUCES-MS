public class Array {
 public static void main(String[] args) {
    int array[] ={2,3,4,5};
    int array1[] =new int[3];
    array1[0]=1;
    array1[1]=2;
    array1[2]=3;

    for(int num:array1)
    {
         System.out.println("Value of num is:"+num);        
    }

    //Multi Dimensional Array
    int arr[][] = new int[3][4];
    //Jagged Array
    int ar[][]=new int[3][];
    ar[0]=new int[4];
    ar[1]=new int[3];
    ar[2]=new int[5]; 
 }    
}
