//TNPG: BrainForked (Gloria Lee, Jack Chen, John Gupta-She)
//APCS pd8
//HW76 -- We Got a Little Old Convoy 
//2022-03-11f
//time spent: 1.1 hrs 
//KTS used: 1 page (each)

/*

Notes:

- Should new nodes be added to the front or back of the list? Adding to the front is optimal and has constant run time.
  Adding to the back would have linear runtime and would not be optimal, but it is also inline with the add's we've done so far.
  
- get/set methods have a linear runtime because you can't instantly go to an index but instead must traverse until the index is reached.
- how would a remove method work? remove from front or back? code?

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

  //return data in element at position i
  public String get( int i );

  //overwrite data in element at position i
  public String set( int i, String x );

  //return length of list
  public int size();

}//end interface