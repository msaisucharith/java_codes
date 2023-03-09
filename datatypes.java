import java.util.Scanner;

//they are total four type of data types
//1)integer 2)float 3)boolean 5)char
//in integer we have four 1.byte(1-size) 2.short(2) 3.int(4) 4.long(8)
//in float 1.float(4) 2.double(8)
//char size is 2

//we need to take data types according to  your need

public class datatypes {
    public static void main(String args[]){
        System.out.println("hello world");
        Scanner sn=new Scanner(System.in);
        byte a;
        a=new Scanner(System.in).nextByte();
        System.out.println("the byte value is "+a);

        float b;
        b=sn.nextFloat();
        System.out.println("the float value is "+b);

        System.out.println(3>5);


    }
}
