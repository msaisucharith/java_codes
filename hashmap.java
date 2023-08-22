package hashmap;
import java.util.*;
public class hashmap {


  public static void main(String[] args) {

    HashMap<String,Integer> map=new HashMap<> ();
    map.put("kallur", 120);
    map.put("pamidi",129);
    map.put("gooty",90);

    System.out.println(map);

    System.out.println(map.get("kallur"));
    System.out.println(map.containsKey("kallur"));
    System.out.println(map.isEmpty());

    System.out.println();

    // iterating hashmap

    Set<String> keys=map.keySet();

    for(String key:keys){
      System.out.print(key+" ");
      System.out.println(map.get(key));
    }
    
  }
  
}
