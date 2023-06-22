package recursion;

public class powerofNumber {
  

  public int powers(int n,int p){


    if(p==0){
      return 1;
    }
    else{

      return n*powers(n, p-1);

    }
  }

  public static void main(String[] args) {
    
    powerofNumber obj=new powerofNumber();

    System.out.println(obj.powers(2,2));
  }
}
