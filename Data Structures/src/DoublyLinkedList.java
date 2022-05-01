
public class DoublyLinkedList {
	/** A linked list is a list of nodes that are linked together
    Can be singular, double or circular
      
    Doubly:
    		   <prev-      <prev-      <prev-
    [data/head]-next>[data]-next>[data]-next>[data]->null
      (Node)          (Node)      (Node)      (Node)  
      
  
    Advantages: Resizable, Easy to insert and delete
    Disadvantages: No random access, Extra memory space for pointer is required for each element */
	
	Node head;
	   
	   /* Class for each individual Node*/ 
	   class Node{
	     int data; //this data can be any data type 
	     Node next; //pointer
	     Node prev; //pointer

	     Node(int data){ //Creates a new node
	       this.data = data;
	       next = null; //initialed to null
	       prev = null;
	     }
	   }
	   
	   /* this method adds a new node to the beginning of the list */
	   public void push(int data) {
		   Node temp = new Node(data); //creates a new temp node
		   
		   temp.next = head; //next of temp node is current head node
		   temp.prev = null; // prev of temp node is null
		   
		   if(head != null) { //change previous of head node to the new temp node
			   head.prev = temp;
		   }
		   
		   head = temp; //change head to the new temp node
	   }
	   
	   /* inserts a new node after a specific data point */
	   public void insertAfter(Node prev, int data){
		   if(prev == null) { //check if the given prev node is null
			   return;
		   }
		   
		   Node temp = new Node(data); //create a temp node
		   temp.next = prev.next; //new of new node is next of prev node
		   prev.next = temp; //new of prev node is the new temp node
		   temp.prev = prev; //make prev node as previous of temp;
		   
		   if(temp.next != null) { //change previous of temp node next node
			   temp.next.prev = temp;
		   }
	   }
	   
	   /* inserts a new node at the end of the list */ /* for a singular list */
	   public void insertEnd(int data) {
		   Node temp = new Node(data); //creates a new temp node
		   
		   Node end = head; //creates a end pointer node that points to head
		   
		   temp.next = null; //making next of temp node null
		   
		   if(head == null) { //if head is null make temp node head
			   temp.prev = null;
			   head = temp;
			   return;
		   }
		   
		   while(end.next != null) { //traverse to the end of linked list
			   end = end.next;
		   }
		   
		   end.next = temp; //change the next of the end node to the new temp node
		   temp.prev = end; //make end node as previous of temp node
	   }
	   
	   public void print() {
		   Node temp = head;
		   while(temp != null) {
			   System.out.print(temp.data + " ");
			   temp = temp.next;
		   }
	   }
	   
	   public void delete(int key) {
		   Node temp = head;
		   if(temp == null) {
			   return;
		   }
		   
		   while((temp.next != null) || (temp.data != key)) {
			   temp = temp.next;
		   }
		   
		   if(temp.data == key) {
			   temp.prev.next = temp.next;
			   temp.next.prev = temp.prev;
		   }
	   }
	  
	   public static void main(String[] args){
		    DoublyLinkedList ll = new DoublyLinkedList();

		    ll.push(2);
		    ll.insertEnd(5);
		    ll.insertEnd(7);
		    ll.insertEnd(9);
		    ll.insertEnd(11);
		    //System.out.println(ll.getLength());
		    ll.print();
		    ll.delete(7);
		    //ll.reverse();
		    System.out.println();
		    ll.print();
		    
		  }


}








