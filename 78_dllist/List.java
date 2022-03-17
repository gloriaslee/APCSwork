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

/***
 * interface List
 * subset of actual Java List interface
 * Specifies actions a List must be able to perform.
 * 
 * If placed in current working dir, will be consulted instead of
 *  built-in Java library interface.
 **/

public interface List
{
  //add node to list, containing input String as its data
  public boolean add( String x );
  
  // public void add( int i, String x );


  //remove node from list, return its data
  public String remove( int index );

  //return data in element at position i
  public String get( int i );

  //overwrite data in element at position i
  public String set( int i, String x );

  //return length of list
  public int size();

}//end interface