public class string_creating_constru {
    public static void main(String[] args) {
//        new is key word in java for creating a object and allocate space for it on heap

        char ch[]={'a','b','c','d'};

        byte bt[]={65,66,67,68};

        String st=" saisucharith";

//        string created by using char by passing byte literal
//        it will return the index from 1 and the length 3
        String st1=new String(bt,1,3);

//       string creates by using char by passing char literal
        String st2=new String(ch);

//        string creates by passing string in the literal
        String st3=new String("abc");

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);

//        string methods

        System.out.println(st3.length());
        System.out.println(st3.toUpperCase());
        System.out.println(st3.toLowerCase());
//        trim method will remove spaces
        System.out.println(st.trim());

//        indexing in java
        System.out.println(st.substring(2,8));

//        replace in string

        System.out.println(st.replace('a','z'));
        System.out.println(st.substring(2));

    }
}
