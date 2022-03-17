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
 * class ListTester
 * ...for putting your LList through its paces
 *
 * Assumes local List.java (interface),
 *  overriding List interface from standard Java library
 **/

public class ListTester
{
  public static void main( String[] args )
  {

    //instantiate... var type List, obj type LList
    List wu = new LList();

    System.out.println(wu);
    wu.add("RZA");

    System.out.println(wu);
    wu.add("GZA");

    System.out.println(wu);
    wu.add("ODB");

    System.out.println(wu);
    wu.add("Inspectah Deck");

    System.out.println(wu);
    wu.add("Raekwon the Chef");

    System.out.println(wu);
    wu.add("U-God");

    System.out.println(wu);
    wu.add("Ghostface");

    System.out.println(wu);
    wu.add("Method Man");

    System.out.println(wu);

    for( int i=0; i<7; i++ ) {
      int n = (int)( wu.size() * Math.random() );
      String imposter = "@";
      System.out.println("adding a poser at index " + n + "...");
      wu.add( n, imposter );
      System.out.println("Updated list: " + wu);
    }

    while( wu.size() > 0 ) {
      int n = (int)( wu.size() * Math.random() );
      System.out.println("deleting node "+ n + "...");
      wu.remove(n);
      System.out.println("Updated list: " + wu);
    }
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class