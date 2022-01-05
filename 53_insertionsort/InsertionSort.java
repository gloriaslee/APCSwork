// Clyde "Thluffy" Sinclair
// APCS pd0
// HW53 -- implementing insertion sort
// 2022-01-06r
// time spent:  hrs

/******************************
 * class InsertionSort -- implements InsertionSort algorithm
 *
 * ALGO:
 * 
 * DISCO
 *
 * QCC
 * q0: How many passes to sort n elements?
 * a0: 
 * q1: What do you know after pass p?
 * a1: 
 * q2: How will you know when sorted?
 * a2:
 * q3: What constitues a pass?
 * a3:
 * q4: What must you track?
 * a4: 
 ******************************/


import java.util.ArrayList;

public class InsertionSort
{
  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al ) {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  
 // BUBBLE SORT LOOP: 
// VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void bubbleSortV( ArrayList<Comparable> data )
  {
    for(int p = 0; p  < data.size(); p++){
      //for each pass, reset counter of swaps to 0.
      //if counter still 0 at end of loop, break because the arraylist is sorted already
      int swapCounter = 0;

	for (int i = 0; i < data.size() -1; i++){

	Comparable a = data.get(i);
	Comparable b = data.get(i+1);
	if (a.compareTo(b) == 1){
		swap(data, i);
    swapCounter+=1;
		}
	}
  if(swapCounter == 0){
    System.out.println("breaking");
    break;
  }
  }
}
