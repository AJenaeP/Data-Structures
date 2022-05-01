
public class SingularLinkedList {
	/** A linked list is a list of nodes that are linked together
	    Can be singular, double or circular
	    Singular:
	    [data/head]-next>[data]-next>[data]-next>[data]->null
	      (Node)          (Node)      (Node)      (Node)
	      
	    Doubly:
	    		   <prev-      <prev-      <prev-
	    [data/head]-next>[data]-next>[data]-next>[data]->null
	      (Node)          (Node)      (Node)      (Node)  
	      
	    Circular:  
	    		   <prev-      <prev-      <prev-
	 -> [data/head]-next>[data]-next>[data]-next>[data] ->
	 |   (Node)          (Node)      (Node)      (Node)  |
	  ----------------------------------------------------
	  
	    Advantages: Resizable, Easy to insert and delete
	    Disadvantages: No random access, Extra memory space for pointer is required for each element */
	  
		Node head;
	   
	   /* Class for each individual Node*/ 
	   class Node{
	     int data; //this data can be any data type 
	     Node next; //pointer

	     Node(int data){ //Creates a new node
	       this.data = data;
	       next = null; //initialed to null
	     }
	   }
	   
	  /* this method adds a new node to the beginning of the list */
	  public void push(int data) { 
		  Node newNode = new Node(data); //creates a new node
		  
		  if(head==null) {
			  head = newNode; //if list is empty, new node is automatically head;
			  return;
		  } else {
			  newNode.next = head; //the new nodes' next value is pointed to head;
			  head = newNode; //head becomes the new node
		  }
	  }
	  
	  /* inserts a new node after a specific data point */
	  public void insertAfter(int key, int data){ 
		  Node temp = head; //creates a temp node
		  Node newNode = new Node(data); //creates node to be inserted
		  
		  while((temp != null) && (temp.data != key)) { //traverse the list until the node with the key data is found
			  temp = temp.next;
		  }
		  if(temp.data == key) { //if node with key data is found
			  temp.next = newNode;
			  newNode.next = temp.next.next;
		  }	  
	  }
	  
	  /* inserts a new node at the end of the list */ /* for a singular list */
	  public void insertEnd(int data) { 
		  Node newNode = new Node(data); //creates a new node
		  
		  if(head == null) { //if head is empty , new node becomes head
			  head = new Node(data);
			  return;
		  }
		  Node temp = head; //creates a temp node
		  
		  while(temp.next != null) { //traverse linked list
			  temp = temp.next;
		  }
		  
		  temp.next = newNode; // once end of linked list is found add the new node
	  }
	  
	  /* deletes the first occurrence of a given key */
	  public void delete(int key) {
		  Node temp = head; //creates a temp node
		  
		  if((temp != null) && (temp.data == key)){ //if head is equal to the key
			  head = temp.next; //delete the node at head and move head to the right
			  return;
		  }
		  
		  while((temp != null) && (temp.next.data != key)){ //traverse list //while temp isnt null and the next value doesnt equal key
			  temp = temp.next;
		  }
		  
		  if(temp == null){ //if the value of node isnt in the list
			  return;
		  }
		  
		  temp.next = temp.next.next; //if the key is in the next node next.next is the next value of temp
	  }
	  
	  /* prints each data point in the linked list */ 
	  public void print() { 
		  Node temp = head;
		  
		  while(temp != null) {
			  System.out.print(temp.data + " "); //print each data in the list
			  temp = temp.next;
		  }
	  }
	  
	  /* reverse a linked list */
	  public void reverse(){
	    Node prev = null;
	    Node current = head;
	    Node next = head;

	    while(current != null){
	      next = current.next;
	      current.next = prev;
	      prev = current;
	      current = next;
	    }
	    head.next = null;
	    head = prev;
	  }
	  
	  public int getLength() {
		  Node temp = head;
		  int length = 0;
		  while(temp != null) {
			  length++;
			  temp = temp.next;
		  }
		  return length;
	  }
	  
	  public static void main(String[] args){
	    SingularLinkedList ll = new SingularLinkedList();

	    ll.push(2);
	    ll.insertEnd(5);
	    ll.insertEnd(7);
	    ll.insertEnd(9);
	    System.out.println(ll.getLength());
	    ll.print();
	    
	    ll.reverse();
	    System.out.println();
	    ll.print();
	    
	  }
}
