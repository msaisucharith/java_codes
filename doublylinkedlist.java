package likedlist;


public class doublylinkedlist {

  public Node head;
  // public Node tail;


  // printdll

  public void printdll(){

    Node node=head;
    Node last=null;

    while(node!=null){

      System.out.print(node.value + "->");
      last=node;
      node=node.next;
    }
    System.out.println("END");

    while(last!=null){

      System.out.print(last.value+"->");
      last=last.previous;
    }
    System.out.println("END");

  }



  
  
  // insert

  public void insertFirst(int value){

    Node node=new Node(value);

    node.next=head;
    node.previous=null;
    if(head!=null){
      head.previous=node;
    }
    head=node;


  }

    // insert last

  public void insertLast(int value){
    Node node=new Node(value);

    Node temp=head;

    if(head==null){
      node.previous=null;
      head=node;
      return;
    }

    while(temp.next!=null){
      temp=temp.next;
    }

    temp.next=node;
    node.previous=temp;


  }

  // // insert at index

  // public void insertIndex(int value,int index){

  //   Node node=new Node(value);

  //   Node temp=head;
  //   for(int i=1;i<index;i++){
  //     temp=temp.next;
  //   }

  //   Node tem=temp;
  //   temp.next=node;
  //   node.previous=temp;
  //   tem.previous=node;
  //   node.next=tem;

  // }

  public void insertIndex(int value,int find){
    Node node=new Node(value);

    Node temp=head;

    while(temp.value!=find){
      temp=temp.next;
    }

    node.next=temp.next;
    node.previous=temp;
    temp.next=node;
    if(node.next!=null){

      node.next.previous=node;
    }

  }
  

  public class Node{
    int value;
    Node previous;
    Node next;

    public Node(int value){
      this.value=value;
    }

    public Node(int value,Node previous,Node next){
      this.value=value;
      this.previous=previous;
      this.next=next;
    }

  }

}
