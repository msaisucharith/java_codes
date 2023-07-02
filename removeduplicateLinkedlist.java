package likedlist;

public class removeduplicateLinkedlist {
  
  public Node head;
  public Node tail;

  int size=0;

  public removeduplicateLinkedlist(){
    size++;
  }


  public class Node{

    public int value;
    public Node next;

    public Node(int value){
      this.value=value;
    }

    public Node(int value,Node next){

      this.value=value;
      this.next=next;

    }

  }

  

  // insert 

  public void insertFirst(int val){

    Node node=new Node(val);

    node.next=head;
    head=node;

    size++;

    if(tail==null){
      tail=head;
    }


  }

  // insert last

  public void insertLast(int value){
    Node node=new Node(value);
    if(head==null){
      insertFirst(value);
    }
    else{
      tail.next=node;
      tail=node;

    }
    

  }

  // insert at index

  public void insert(int value,int index){

    if(index==1){
      insertFirst(value);
      return;
    }

    if(index==size){
      insertLast(value);
    }

    Node node=new Node(value);

    Node temp=head;
    for(int i=1;i<index;i++){

      temp=temp.next;

    }

    Node tem=temp.next;
    temp.next=node;
    node.next=tem;
    size++;

  }

  // delete first

  public int deleteFist(){

    int value=head.value;

    head=head.next;

    size--;
    return value;

  }

  // delete last

  public int deleteLast(){

    Node secondLast=get(size-1);

    int value=secondLast.next.value;

    secondLast.next=null;
    tail=null;

    return value;

  }

  // delete at index

  public int deleteIndex(int index){

    if(index==1){
      deleteFist();
    }

    if(index==size){
      deleteLast();
    }

    Node beforen=get(index-1);

    int value=beforen.next.value;

    beforen.next=beforen.next.next;

    return value;

  }
  

  // get

  public Node get(int index){
    Node temp=head;

    for(int i=1;i<index;i++){
      temp=temp.next;
    }

    return temp;

  }


  public void printLL(){
    Node temp=head;

    while(temp!=null){
      int value=temp.value;
      System.out.print(value+"=>");

      temp=temp.next;
    }
  }

  // removeDuplicates

  public void removeDuplicates(){

    Node node=head;

    while(node.next != null){
      if(node.value==node.next.value){
        node.next=node.next.next;
      }
      else{
        node=node.next;
      }
      tail=node;
      tail.next=null;
    }
  }

  public static void main(String[] args) {
    
    singlelikedlist sll=new singlelikedlist();

    sll.insertFirst(1);
    sll.insertFirst(1);
    sll.insertFirst(2);
    sll.insertFirst(2);
    sll.insertFirst(3);
    sll.removeDuplicates(); 
    sll.printLL();
  }



}
