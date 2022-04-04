// Team BrainForked (Gloria Lee, Jack Chen, John Gupta-She)
// APCS pd8
// HW 87- The English Do Not Wait In Line For Soup
// 2022-04-03
// time spent: 0.7  hr
/*
QCC:
  - It's chewsday innit?
  - What are QUASARs? (im thinking quesedillas)
DISCO:
  - This hw incorporated classes within classes. In this case, because LLNode was not static, it was an inner class.
  - We put class LLNode inside of NodeQueue so that it can access the methods from LLNode.
*/
/***
 * interface Queue
 * Includes only methods listed in AP subset of Java
 * (Local version, to override built-in Java implementation.)
 **/

public interface Queue<QUASAR>
{
  //~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public QUASAR dequeue();

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( QUASAR x );

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty();

  //Returns the first element of the queue without dequeuing it.
  public QUASAR peekFront();
  //~~~~~~~~~~~~~~~~~~~end AP subset~~~~~~~~~~~~~~~~~~~

}//end interface Queue
