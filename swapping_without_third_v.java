public class swapping_without_third_v {
    public static void main(String args[]){
        int a=1,b=2;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}
