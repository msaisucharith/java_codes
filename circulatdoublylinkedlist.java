package likedlist;


public class circulatdoublylinkedlist {

  public Node head;
  public Node tail;
  public int size;


  // printdcll

  public void printdcll(){
    Node node=head;

    while(node.next != head){
      System.out.print(node.value+"<->");
      node=node.next;
    }
    System.out.print(node.value);
  }


  // insert at first

  public void insertFirst(int value){

   
      if(head==null){
        Node node=new Node(value);
        node.next=node.previous=node;
        head=node;
        tail=node;
        return;
      }
      Node last=head.previous;

      Node node=new Node(value);
      node.next=head;
      head.previous=node;
      node.previous=last;
      last.next=node;

      // Node node=new Node(value);

      // node.next=head;
      // head.previous=node;
      // node.previous=tail;
      // head=node;
      // tail.next=head;
      
      

  }

  // insert at index

  public void insertIndex(int value,int find){
    Node node=new Node(value);

    Node temp=head;
    while(temp.value!=find){
      temp=temp.next;
    }

    node.next=temp.next;
    node.previous=temp;
    temp.next.previous=node;
    temp.next=node;
  }
 
  
  class Node{
    int value;
    Node previous;
    Node next;

    public Node(int value){
      this.value=value;
    }
  }
}
