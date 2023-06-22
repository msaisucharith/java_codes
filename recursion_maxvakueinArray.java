package codingexample;


public class recursion_maxvakueinArray {


  public void maxValue(int N){


    if(N<10){
      System.out.println(N);
    }
    else{
      System.out.print(N%10);
      maxValue(N/10);
    }
   

  }



  public static void main(String[] args) {

    recursion_maxvakueinArray obj=new recursion_maxvakueinArray();

    obj.maxValue(1234);

    
  }
  
}
