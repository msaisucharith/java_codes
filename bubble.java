package sortingcodes;

import java.util.Arrays;

public class bubble {

  public static void main(String[] args){

    int[] arr={13,495,23,28,34,23};

    for(int i=0;i<arr.length-1;i++){
      for(int j=0;j<arr.length-i-1;j++){

        if(arr[j]>arr[j+1]){

         int tem=arr[j];
          arr[j]=arr[j+1];
           arr[j+1]=tem;

        }

      }

    }

    System.out.println(Arrays.toString(arr));

  }
  
}
