class Main{
  static class Linked{
    class Node{
      String data;
      Node next;
  
      Node(String data){
        this.data= data;
        this.next = null;
      }
    }
    Node head = null;
    
    //add first
    public void addFirst(String data){
      Node newNode = new Node(data);
      if(head == null){
        head = newNode;
        return;
      }
      newNode.next =head;
      head =newNode;
    }
    //add last
    public void addLast(String data){
      Node newNode = new Node(data);
      if(head == null){
        head = newNode;
        return;
      }
      Node temp = head;
      while(temp.next!=null){
        temp =temp.next;
      }
      temp.next =newNode;
    }
    //delete first
    public void deleteFirst(){
      if(head==null)
      {
        System.out.println("List is empty");
        return;
      }
      head =head.next;
    }
    //delete last
    public void deleteLast(){
      if(head.next==null){
        head =null;
        return;
      }
      Node secondLast = head;
      Node last = head.next;
      while(last.next!=null){
        secondLast = secondLast.next;
        last=last.next;
      }
      secondLast.next =null;
    }
    //print
    public void display(){
      if(head==null)
      {
        System.out.println("List is empty");
        return;
      }
      Node temp = head;
      while(temp!=null){
        System.out.print(temp.data+ " "+ "-> ");
        temp=temp.next;
      }
      System.out.println("NULL");
    }
  }
  public static void main(String[] args) {
      Linked list = new Linked();
      list.addFirst("is");
      list.display();
      list.addFirst("Ayush");
      list.display();
      list.addLast("a");
      list.addLast("boy");
      list.display();
      list.addLast("girl");
      list.addFirst("The");
      list.display();
      list.deleteFirst();
      list.display();
      list.deleteLast();
      list.display();
      System.out.println("Successful");  
    }
}