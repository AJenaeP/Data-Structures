
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
		   Node temp = new Node(data);
		   
		   temp.next = head;
		   temp.prev = null;
		   
		   if(head != null) {
			   head.prev = temp;
		   }
		   
		   head = temp;
	   }

}
