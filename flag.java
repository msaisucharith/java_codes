public class flag {
    public static void main(String args[]){
        int a=11;

        int b=-12;

        float f=32.9028f;

        System.out.printf("%d\n",a);

//        flag 0 "it will all empty with 0's"
        System.out.printf("%05d\n",a);

//        flag bracket"(" for negative it will assign ()

        System.out.printf("%(d\n",b);

        System.out.printf("%10.3f\n",f);

//        flag negative "-" it will start from left hand side

        System.out.printf("%-20f",f);



    }
}
