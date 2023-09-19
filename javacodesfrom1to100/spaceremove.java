package w3resouce;

import java.util.Scanner;

public class spaceremove {
  
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);

    String str=sc.nextLine();

    char[] chr=str.toCharArray();

    StringBuffer st1=new StringBuffer();

    for(char c:chr){
      if(!Character.isWhitespace(c)){
        st1.append(c);
      }
    }

    System.out.println(st1);

  }

}
