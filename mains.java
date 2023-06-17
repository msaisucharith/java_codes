package likedlist;

public class mains {

 public static void main(String[] args) {
  
  // singlelikedlist sll=new singlelikedlist();

  // sll.insertFirst(1);
  // sll.insertFirst(2);
  // sll.insertFirst(3);
  // sll.insertFirst(4);
  // sll.insertLast(11);
  // sll.insert(400, 2);
  // System.out.println(sll.deleteFist());
  // System.out.println(sll.deleteLast());
  // System.out.println(sll.deleteIndex(2));
  // sll.printLL();

  doublylinkedlist dll=new doublylinkedlist();

  dll.insertFirst(1);
  dll.insertFirst(2);
  dll.insertFirst(3);
  dll.insertLast(100);

  dll.insertIndex(2000, 100);
  
  dll.printdll();

 }
  
}
