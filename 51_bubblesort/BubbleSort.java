// 3 Lucky Duckies: Gloria Lee, Ziying Jian, Nora Miller
// APCS pd8
// HW51 -- implementing bubblesort
// 2022-01-04t
// time spent: 1 hr

/******************************
 * class BubbleSort -- implements bubblesort algorithm (vanilla)
 *
 * ALGO: Traverses through the ArrayList in ascending order.
 * If a value is greater than the value right of it, swap. Continue until you evaluate second to last value.
 * Then, rinse and repeat until no swaps are made during array traversal.
 *
 * DISCO
 * The issue of pass by value vs pass by reference presented itself here.
 * Because Java passes references by value, you can't just shallow copy an ArrayList and change that.
 * Instead, you have to copy each element one by one into the new array.
 * We generally use size() instead of length() to refer to the no. of elements in an ArrayList
 * p - 1 < size() is different from p < size() -1
 *
 * QCC
 * q0: If a pass requires no swaps, what do you know?
 * a0: The ArrayList is sorted (in increasing order)
 * q1: After pass p, what do you know?
 * a1: The last p elements in the ArrayList are guaranteed to be in their final positions.
 * q2: How many passes are necessary to completely sort?
 * a2: For a worst case scenario, ArrayList.size() - 1 passes. You don't need size number of passes
 * because in the last pass, you guarantee two values are in their final positions, not just one.

 ******************************/

import java.util.ArrayList;

public class BubbleSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond:  lo < hi && size > 0
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
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  public static void swap(ArrayList<Comparable> al, int i){
	al.set(i, al.set(i+1, al.get(i)));
  }

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



  // ArrayList-returning bubbleSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input )
  {
    //can't shallow copy, so copy manually
    ArrayList<Comparable> newInput = new ArrayList<Comparable>();
    for(int i = 0 ; i < input.size() ; i++){
      newInput.add(input.get(i));
    }
    bubbleSortV(newInput);
    return newInput;
  }


  public static void main( String [] args )
  {

    //===============for VOID methods=============
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      bubbleSortV(glen);
      System.out.println( "ArrayList glen after sorting:\n" + glen );
      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      bubbleSortV(coco);
      System.out.println( "ArrayList coco after sorting:\n" + coco );


    //==========for AL-returning methods==========
      glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = bubbleSort( glen );
      System.out.println( "sorted version of ArrayList glen:\n"
      + glenSorted );
      System.out.println( "ArrayList glen after sorting:\n" + glen );
      coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = bubbleSort( coco );
      System.out.println( "sorted version of ArrayList coco:\n"
      + cocoSorted );
      System.out.println( "ArrayList coco after sorting:\n" + coco );



  }//end main

}//end class BubbleSort
