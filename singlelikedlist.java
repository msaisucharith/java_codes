package likedlist;


public class singlelikedlist {

  public Node head;
  public Node tail;

  int size=0;

  public singlelikedlist(){
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



















  // public Node head;
  // public Node tail;
  // public int size=0;

  // public singlelikedlist(){
  //   size++;
  // }

  // public void printLL(){
  //   Node tem=head;

  //   while(tem!=null){
  //     System.out.print(tem.value+" -> ");
  //     tem=tem.next;
  //   }
  //   System.out.println("END");
  // }

  // // delete

  // public int deleteFist(){

  //   int val=head.value;
  //   head=head.next;
  //   if(head==null){
  //     tail=null;
  //   }
  //   size--;
  //   return val;

  // }

  // // delete at index

  // public int deleteIndex(int index){

  //   if(index==1){
  //     return deleteFist();
  //   }
  //   if(index==0){
  //     return deleteLast();
  //   }

  //   Node prevo=get(index-1);
  //   int value=prevo.next.value;

  //   prevo.next=prevo.next.next;

  //   return value;

  // }

  // // delete 

  // public int deleteLast(){
  //   if(size<=1){
  //     return deleteFist();
  //   }

  //   Node secondLast=get(size-2);

  //   int value=tail.value;
  //   tail=secondLast;
  //   tail.next=null;

  //   return value;
     
  // }

  // // 

  // public Node get(int index){
  //   Node node=head;
  //   for(int i=0;i<index;i++){
  //     node=node.next;
  //   }
  //   return node;
  // }

  // // insert 

  // public void insert(int val,int index){
  //   if(index==0){
  //     insertFirst(val);
  //     return;
  //   }
  //   if(index==size){
  //     insertLast(val);
  //     return;
  //   }

  //   Node temp=head;

  //   for(int i=1;i<index;i++){
  //     temp=temp.next;
  //   }

  //   Node node=new Node(val, temp.next);
  //   temp.next=node;
  // }

  // // insert at first

  // public void insertFirst(int val){

  //   Node node=new Node(val);

  //   node.next=head;
  //   head=node;
    

  //   if(tail==null){
  //     tail=head;
  //   }

  //   size=size+1;

  // }

  // // insert at last

  // public void insertLast(int val){
  //   if(tail==null){
  //     insertFirst(val);
  //     return;
  //   }
  //   else{
  //     Node node=new Node(val);
  //     tail.next=node;
  //     tail=node;
  //     size++;
  //   }

  // }



  // public class Node{

  //   public int value;
  //   public Node next;

  //   public Node(int value){
  //     this.value=value;
  //   }

  //   public Node(int value,Node next){
  //     this.value=value;
  //     this.next=next;
  //   }

  // }
 
}
