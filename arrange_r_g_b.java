package codingexample;

public class arrange_r_g_b {

  public static void main(String[] args) {
    
    String str="grgrb";

    StringBuffer r=new StringBuffer();
    StringBuffer g=new StringBuffer();
    StringBuffer b=new StringBuffer();

    for(int i=0;i<str.length();i++){
      if(str.charAt(i)=='g'){
        g.append(str.charAt(i));
      }
      if(str.charAt(i)=='r'){
        r.append(str.charAt(i));
      }
      if(str.charAt(i)=='b'){
        b.append(str.charAt(i));
      }
    }

    System.out.println(r+""+g+""+b);

  }
  
}
