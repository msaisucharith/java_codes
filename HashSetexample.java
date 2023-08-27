package hackerranks;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetexample {

  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);

    int length=sc.nextInt();
    
    String[] left_Pair=new String[length];
    String[] right_Pair=new String[length];

    for(int i=0;i<length;i++){
      left_Pair[i]=sc.next();
      right_Pair[i]=sc.next();
    }

    HashSet<String> hs=new HashSet<String>(length);

    for(int i=0;i<length;i++){
      hs.add(left_Pair[i]+right_Pair[i]);
      System.out.println(hs.size());
    }




  }
  
}
