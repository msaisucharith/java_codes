package codingexample;

import java.util.Scanner;

public class stringconverter {


  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);

    String str="HElloWorld";

    StringBuffer st1=new StringBuffer();

    char c1=str.charAt(0);
    st1.append(Character.toLowerCase(c1));

    for(int i=1;i<str.length();i++){
      if(Character.isUpperCase(str.charAt(i))){
        st1.append("-");
        st1.append(Character.toLowerCase(str.charAt(i)));
      }
      if(Character.isLowerCase(str.charAt(i))){
        st1.append(str.charAt(i));
      }
    }

    System.out.println(st1.toString());

  }
  
}
