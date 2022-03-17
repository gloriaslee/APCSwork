// Team BrainForked (Gloria Lee, Jack Chen, John Gupta-She)
// APCS pd8
// HW78: Double Up
// 2022-03-16w
// time spent: 1  hr
/*
DISCO:
* You can't just setNext like we did with LLNode, because now we also have to account for making sure that the point for
 previous node also points to the correct thing. (setPrev) This can get tricky to keep track of.
  
}

QCC:
* Is this how it's supposed to work?
* Correct output?
* When we add a new prev node to the node, do they connect by the new prev node's cdr?
  The new node's prev is also set to temp? 
  
ALGO ADD:
  Create new DDLNode of with null prev and next and cargo as input.
  Iterate through the List until you reach the index one less than the index of the index of addition using tmp and tmp = tmp.getNext() each time
  At that index, set the new node's _nextNode to the DDLNode at that index's getNext()
  set the new node's _prevNode to tmp 
  set tmp's new Next to be the new Node.
  

  
ALGO REM:
  Iterate through list until you reach index -1 of desired removal target. 
  Set the DLLNode at that index's next to the DLLNode two right of it. 
  Then, set the DLLNode at index of removal to the DLLNode at index -1
KTS USED: 3 pages total
*/


/*****************************************************
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 *****************************************************/

public class DLLNode
{
    //instance vars
    private String _cargo;    //cargo may only be of type String
    private DLLNode _prevNode; //pointer to previous DLLNode
    private DLLNode _nextNode;//point to next DLLNode
    
    // constructor -- initializes instance vars
    public DLLNode( DLLNode prev, String value, DLLNode next ) {
	_cargo = value;
  _prevNode = prev;
	_nextNode = next;
    }


    //--------------v  ACCESSORS  v--------------
    public String getCargo() { return _cargo; }

    public DLLNode getNext() { return _nextNode; }
    
    public DLLNode getPrev() { return _prevNode; }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public String setCargo( String newCargo ) {
	String foo = getCargo();
	_cargo = newCargo;
	return foo;
    }
    
    public DLLNode setPrev( DLLNode newPrev ) {
	DLLNode foo = getPrev();
  //newPrev = newPrev.setNext(this);
	_prevNode = newPrev;
	return foo;
    }
    
    public DLLNode setNext( DLLNode newNext ) {
	DLLNode foo = getNext();
  //newNext = newNext.setPrev(this);
	_nextNode = newNext;
	return foo;
    }
    

    //--------------^  MUTATORS  ^--------------

    
    // override inherited toString
    public String toString() { 
      
      return _cargo.toString(); 
    }


    //main method for testing
    public static void main( String[] args )
    {

	//Below is an exercise in creating a linked list...

	//Create a node
	DLLNode first = new DLLNode( null, "cat", null );
  System.out.println(first);

	//Create a new node after the first
	first.setNext( new DLLNode( null, "dog", null ) );
  System.out.println(first.getNext());


	//Create a third node after the second
	first.setPrev( new DLLNode( null, "cow", null ) );
  System.out.println(first.getPrev());


	/* A naive list traversal, has side effects.... ??
	   while( first != null ) {
	   System.out.println( first );
	   first = first.getNext();
	   }
	*/

	//Q: when head ptr moves to next node in list, what happens to the node it just left?

	//...so better: ?
	//
	//
	//
	
    }//end main

}//end class LLNode