
public class widening_narrowing {
    public static void main(String args[]){
        byte b=10;
        int i=10;
        short s=10;
        double d=10;
        float f=10;
        char c='c';
        boolean bl=true;
//        type casting in java
//        widening - storing a smaller data into big data type
//        eg - byte storing in long
//        =>we can assign byte any data type
        i=b;
        b=(byte) s;
        System.out.println(b);

//
//        if we want to assign small data type large data type we will use narrowing
//        in narrowing we will change the type of the data by changing
        b=(byte) d;
        System.out.println(b);
    }
}