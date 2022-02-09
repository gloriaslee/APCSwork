/***
  Great, Nice Jingles - Gloria Lee, Nafiz Labib (Flounder, Martha)
  APCS pd08
  HW61: Instructions So Simple...
  2022-02-08
  time spent: 0.75 hours

  DISCO -
  - When one array's elements are all added to the merged array, we can use a for loop to iterate through the rest of the other array and then break the outer for loop.
  - To account for arrays with odd elements when using sort(), we can make one half be arr.length/2 while the other arr.length - arr.length/2 so that all elements are used.
  - Return merge method with inputs sort method so that the recursion is in effect.

  QCC -
  - Is merge really true to the algorithm we discussed earlier for mergesort if it's not always removing the element added to the sorted array?
  - Why not use ArrayLists to stay true to the algorithm discussed, as it has remove methods? (referring previous question)
  - What might a pass constitute? Is there such thing as a pass in mergesort?
  - How many compares will be made in total?

  MISC -
  - Will we finally be successful with mergesort in class?

*************************************************************  
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm:
    sort take input param of an array and returns the array sorted. It does this by:
    - returning the same array if already length 1 array
    - dividing the array into two halves if not length 1 and
      merging the two halves after they themselves are sorted.
      the result of this merge is returned as the sorted array.
  ***/

public class MergeSort
{
  /******************************************************
   * int[] merge(int[],int[])
   * Merges two input arrays
   * Precond:  Input arrays are sorted in ascending order
   * Postcond: Input arrays unchanged, and
   * output array sorted in ascending order.
   ******************************************************/
  private static int[] merge( int[] a, int[] b )
  {
    int[] c = new int[a.length + b.length];
    int aCounter = 0;
    int bCounter = 0;
    for (int cCounter = 0; cCounter < c.length; cCounter++){
      if (a[aCounter] <= b[bCounter]){
        c[cCounter] = a[aCounter];
        aCounter++;
      }
      else{
        c[cCounter] = b[bCounter];
        bCounter++;
      }
      if (aCounter == a.length){

        for (cCounter = aCounter + bCounter; cCounter < c.length; cCounter++){

          c[cCounter] = b[bCounter];
          bCounter++;
        }
        break;
      }
     if (bCounter == b.length){

        for (cCounter = aCounter + bCounter; cCounter < c.length; cCounter++){

          c[cCounter] = a[aCounter];
          aCounter++;
        }
        break;
      }
    }
    return c;
  }//end merge()

  /******************************************************
   * int[] sort(int[])
   * Sorts input array using mergesort algorithm
   * Returns sorted version of input array (ascending)
   ******************************************************/
  public static int[] sort( int[] arr ){
    int[] firstHalf = new int[arr.length/2];
    int[] secondHalf = new int[arr.length - arr.length/2];
    if (arr.length == 1){
      return arr;
    }
    else{

    for (int i = 0; i < firstHalf.length; i++){
      firstHalf[i] = arr[i];
    }
    for (int j = 0; j < secondHalf.length; j++){
      secondHalf[j] = arr[j + firstHalf.length];
    }
  }

  return merge(sort(firstHalf), sort(secondHalf));
  }//end sort()

  //-------------------HELPERS-------------------------
  // tester function for exploring how arrays are passed
  // usage: print array, mess(array), print array. Whaddayasee?
  public static void mess( int[] a ) {
    for( int i = 0 ; i<a.length; i++ )
      a[i] = 0;
  }

  //helper method for displaying an array
  public static void printArray( int[] a ) {
    System.out.print("[");
    for( int i : a )
      System.out.print( i + ",");
    System.out.println("]");
  }
  // ---------------------------------------------------


  //main method for testing
  public static void main( String [] args )
  {
      int[] arr0 = {0};
      int[] arr1 = {1};
      int[] arr2 = {1,2};
      int[] arr3 = {3,4};
      int[] arr4 = {1,2,3,4};
      int[] arr5 = {4,3,2,1};
      int[] arr6 = {9,42,17,63,0,512,23};
      int[] arr7 = {9,42,17,63,0,9,512,23,9};


      System.out.println("\nTesting mess-with-array method...");
      printArray( arr3 );
      mess(arr3);
      printArray( arr3 );
      System.out.println("\nMerging arr1 and arr0: ");
      printArray( merge(arr1,arr0) );

      System.out.println("\nMerging arr4 and arr6: ");
      printArray( merge(arr4,arr6) );


      System.out.println("\nSorting arr4-7...");
      printArray( sort( arr4 ) );
      printArray( sort( arr5 ) );
      printArray( sort( arr6 ) );
      printArray( sort( arr7 ) );

  }//end main()

}//end class MergeSort
