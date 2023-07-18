package codingexample;

public class secondSmallestinArray {

  public static void main(String[] args) {
    
    int[] arr={14,23,11,57};

    int smallV=arr[0];

    for(int i=0;i<arr.length;i++){
      if(arr[i]<smallV){
        smallV=arr[i];
      }
    }

    int SecSV=Integer.MAX_VALUE;

    for(int i=0;i<arr.length;i++){
      if(arr[i]!=smallV && arr[i]<SecSV){
        SecSV=arr[i];
      }
    }

    System.out.println(SecSV);

  }
  
}
