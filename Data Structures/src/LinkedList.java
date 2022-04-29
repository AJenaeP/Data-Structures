
public class LinkedList {
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

	  public static void main(String[] args){
	    LinkedList ll = new LinkedList();

	    
	    
	  }
}
