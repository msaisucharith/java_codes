package recursion;

public class recu_stringLength {
  

  //here we using substring for removing first letter in the string 
  // basically substring will return string as the given index 

  public int Slength(String str){

    if(str==""){
      return 0;
    }
    else{

      return Slength(str.substring(1))+1;
    }
  }

  public static void main(String[] args) {
    
    recu_stringLength obj=new recu_stringLength();

    System.out.println(obj.Slength("github"));

  }
}
