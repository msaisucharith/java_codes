package programmingquestions;



public class recursion {

  // recursion will follow three steps
  // 1)find the recursive statement 
  // 2)find the base statement to exit from the infinite loop
  // 3)find edge cases for problem

  //  printing n numbers
  // static void recur(int n){

  //   if(n==1){
  //     System.out.println("the number is stated from 1");
  //   }
  //   else{
  //     recur(n-1);
  //     System.out.println(n);
  //   }

  // }

  // static int fibonacc(int n){

  //   if(n==0){
  //     return n;
  //   }
  //   if(n==1){
  //     return n;
  //   }
  //   return fibonacc(n-1)+fibonacc(n-2);

  // }
  
  // sum of n numbers
  // public int sumofnumbers(int n){
  //   if(n==0){
  //     return n;
  //   }
  //   if(n<0){
  //     return n;
  //   }
  //   else{
  //     return n+sumofnumbers(n-1);
  //   }
  // }


  // sum of digits

  // public int sumofdigts(int n){
  //   if(n==0){
  //     return 0;
  //   }
  //   else{

  //     return n%10+sumofdigts(n/10);
  //   }
  // }

  // power of number using recrsion

  // public int powerofnumber(int n,int p){

  //   if(p==0){
  //     return 1;
  //   }
  //   if(p==1){
  //     return n;
  //   }
  //   else{
  //     return n*powerofnumber(n, p-1);
  //   }

  // }


  // // gcd 

  // public int gcdof(int a,int b){
  //   if(a<0 || b<0){
  //     return -1;
  //   }
  //   if(b==0){
  //     return a;
  //   }
  //   else{
  //     return gcdof(b, b%a);
  //   }
  // }

  // decimal to binary

  public int dectobinary(int n){
    if(n==0){
      return 0;
    }
    else{
      return n%2+10*dectobinary(n/2);
    }
  }


  public static void main(String[] args){

    int n=12;

    // recur(n);

    // System.out.println(fibonacc(n));

    recursion ob=new recursion();

    System.out.println(ob.dectobinary(n));

    // System.out.println(ob.gcdof(48, 18));

    // System.out.println(ob.powerofnumber(2, 2));

    // System.out.println(ob.sumofnumbers(n));

    // System.out.println(ob.sumofdigts(n));

  }


}
