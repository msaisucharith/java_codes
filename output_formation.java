import java.util.Scanner;

public class output_formation {
    public static void main(String args[]){
        int i=10;
        float f=2923442.8902384f;
        char c='A';
        String s="sai";
        System.out.printf("the value of i is: %d %s %f \n",i,c,f);
//        int inp;
//        System.out.println("enter the number:");
//        inp=new Scanner(System.in).nextInt();
//        System.out.println(inp);

//        argument index by passing index - by passing index we can formate the output
        System.out.printf("%1$d %1$d\n",i);

//        passing width in formated output

        System.out.printf("%(10d\n",i);
        System.out.printf("%4.2f\n",f);
        System.out.printf("%20s",s);
    }
}
