package searchingalgo;

import javax.xml.transform.Source;

public class binary {

  
  public int srarch(int[] arr,int n){
    int start=0;
    int end=arr.length-1;
    int index=0;
    while(start<=end){
      int mid=start+(end-1)/2;

      if(arr[mid]==n){
        return n;
      }

      if(arr[mid]<n){
        start=mid+1;
      }

      else{
        end=mid-1;
      }
      
    }
    return -1;
  
}

public static void main(String[] args) {
  
  int[] arr={1,2,3,4,5,6,7};
  int n=3;

  binary obj=new binary();
  System.out.println(obj.srarch(arr, n));
}
}

