package sortingcodes;

import java.util.Arrays;

public class reverse {

  public static void main(String[] args) {
    
    int[] arr={1,2,3,4,5,6};

    int start=0;
    int end=arr.length-1;

    while(start<end){

      int tem=arr[start];
      arr[start]=arr[end];
      arr[end]=tem;
      start++;
      end--;
    }

    System.out.println(Arrays.toString(arr));

  }
  
}
