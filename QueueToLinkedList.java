package queueTolinkedlist;


public class QueueToLinkedList {
Node forward;
 Node backword;
 public QueueToLinkedList ()
 {
  forward = null;
  backword = null;
 }
 private class Node{
 
  int i;
  Node next;
  Node(int i){
   this.i = i;
  }
  public void displayData(){
   System.out.println("i= " + i);
  }
 }
 
 public void insertLast(int i){
  Node newNode = new Node(i);
  if(isEmpty()){
   forward= newNode;
  }else{

   backword.next = newNode;
  }
  backword = newNode;
 }
 
 public int removeFirst(){  

  int temp = forward.i;

  if(forward.next == null){
   backword = null;
  }

  forward = forward.next;
  return temp;
 }
 

 public void displayList(){
  Node current = forward;
  while(current != null){
   current.displayData();
   current = current.next;
  }
 }
 
 public int nodeData(){
  return forward.i;
 }
 
 public boolean isEmpty(){
  return forward == null;
 }

 public void insert(int item){
  insertLast(item);
 }
 
 public int remove(){
  if(isEmpty()){
   throw new RuntimeException("empty");
  }
  return removeFirst();
 }
 
 public int peek(){
  if(isEmpty()){
   throw new RuntimeException("Queue is empty");
  }
  return nodeData();
 }  
    public static void main(String[] args) {
       QueueToLinkedList  queue = new QueueToLinkedList ();
  queue.insert(3);
  queue.insert(6);
  System.out.println("Displaying data");
  queue.displayList();
  System.out.println("Item peeked " + queue.peek());
  System.out.println("Removing Queue element");
  System.out.println("Item removed " + queue.remove());
  System.out.println("Item removed " + queue.remove());
 }
}