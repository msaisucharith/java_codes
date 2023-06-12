package array;

public class singledimentional {
  
  int arr[];

  public singledimentional(int sizeofarr){
    arr=new int[sizeofarr];

    for(int i=0;i<arr.length;i++){
      arr[i]=Integer.MIN_VALUE;
    }
  }


  public void insert(int pos,int value){


    try{
      if(arr[pos]==Integer.MIN_VALUE){
        arr[pos]=value;
        System.out.println("inserted");
      }
      else{
        System.out.println("the position is occupied");
      }
    } catch(ArrayIndexOutOfBoundsException e){
      System.out.println("out of index");
    }

  }

}
