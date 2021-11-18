/*
 Nora Miller, Gloria Lee, Ziying Jian (3 Lucky Duckies)
 APCS
 HW38 - Slots:  larger program emulating a slot machine with partially random arrays
 2021-11-16
 time spent: 1.3 hrs

 QCC:
 - May we import stuff? (see toString)
 - Do slot machines actually work by swapping?
 - Possible extra exploration: to what extent is the result of shuffling the array in the way we did actually random?

 DISCO:
 - We should be careful with using Math.random() to specify index because there
 is the risk of getting an array index out of bounds error.
 - (Reading the documentation) - there is no copyOf method for String[] -> we need to make one
 - (Reminder to selves:) Utilize old code!
 */


public class Slots2 {

  //instance variable to represent master copy for slot machine
  private static final String[] FRUITS = {
    "lime", "lime", "lime",
    "lemon", "lemon", "lemon",
    "cherry", "cherry", "cherry",
    "peach", "peach", "peach",
    "mango", "mango", "mango"
  };

  private String[] _fruits; //to be init'd by each instance


	public Slots2() // constructor - uses FRUITS and initializes _fruits for the instance.
	{
	  _fruits = new String[FRUITS.length];
	  for (int i = 0; i < FRUITS.length; i++){
		  _fruits[i] = FRUITS[i];
	  } // copies FRUITS into _fruits;

    //allocate memory for _fruits based on size of FRUITS:
    //copy elements of FRUITS into _fruits:
	}

	public static void printArray(String[] array) { // copied from Loopier
		String print = "{" + array[0];
		for (int i = 1; i < array.length; i++) {
			print += ", " + array[i];
		}
		print += "}";
		System.out.println(print);
	}

  /*=====================================
    String toString() -- overrides inherited toString()
    pre:
    post: returns String of elements in slots 0 thru 2, separated by tabs
    =====================================*/
  public String toString() // to be used for printed the slots after the slot machine is spun
  {
	return (_fruits[0] + "\t" + _fruits[1] + "\t" + _fruits[2]);
  }



  private void swap( int i, int j ) // swaps elements in an array, specifically, _fruits
  {
	String inI = _fruits[i];
	_fruits[i] = _fruits[j];
	_fruits[j] = inI;
  }

  /*=====================================
    void spinOnce() -- simulate a pull of the slot machine lever
    pre:  _fruits array exists
    post: randomized order of elements in _fruits array
    =====================================*/
  public void spinOnce()
  {
    for (int i = 0; i < _fruits.length; i++) {
      swap(i, (int)( Math.random()*_fruits.length)) ;
    }
    // A simple approach to shuffling:
    // iterate through the array, swapping
    // the val at each index with a randomly chosen other index
  }

    /*=====================================
      boolean jackpot() -- checks for a winning combo
      pre:  _fruits is existing array
      post: returns true if first 3 slots represent winning combo,
      false otherwise
      =====================================*/
    public boolean jackpot()
    {
      boolean retBoo = false;
      if ( _fruits[0] == _fruits[1]  && _fruits[1] == _fruits[2] ){
        retBoo = true;
      }
      return retBoo;
    }

    /*=====================================
       boolean miniWin() -- checks for a winning combo
       pre:  _fruits is existing array
       post: returns true if first 3 slots represent winning combo,
       or if first 3 slots mutually distinct,
       false otherwise
       =====================================*/
     public boolean miniWin()
     {
       boolean retBoo = false;
       if( _fruits[0] == _fruits[1]  && _fruits[1] == _fruits[2] ){
         retBoo = true;
       }
       if( _fruits[0] != _fruits[1]  && _fruits[1] != _fruits[2] && _fruits[0] !=_fruits[2]){
         retBoo = true;
       }

       return retBoo;
     }

  //main() method for testing
  public static void main( String[] args ) {
    //usage: move bar below down 1 line at a time to test functionality...

    Slots2 machine01 = new Slots2();
    Slots2 machine02 = new Slots2();

    /*
    printArray(machine01._fruits);
    machine01.spinOnce();
    printArray(machine01._fruits);
    System.out.println(machine01.jackpot());
    System.out.println(machine01.miniWin());
*/


    //test to verify slot machines function indepently
    System.out.println();
    System.out.println( "Machine01 initial state:\t" + machine01 );
    System.out.println( "Machine02 initial state:\t" + machine02 );

    System.out.println( "\nSpinning machine01...\n" );

    machine01.spinOnce();

    System.out.println();
    System.out.println( "Machine01 state:\t" + machine01 );
    System.out.println( "Machine02 state:\t" + machine02 );
    System.out.println();


    //test gamble-until-you-win mechanism

    System.out.println( "Preparing to spin until a mini win! . . ." );
    System.out.println( "------------------------------------" );

    //if you haven't won, spin again until you win!
    while( machine01.miniWin() == false ) {
      System.out.println( "Your spin..." + "\t" + machine01 );
      System.out.println( "LOSE\n" );
      machine01.spinOnce();
    }

    System.out.println( "====================================" );
    System.out.println( "Your spin..." + "\t" + machine01 );
    System.out.println( "WIN\n" );



    System.out.println( "Preparing to spin until...jackpot! . . ." );
    System.out.println( "------------------------------------" );


    //if you haven't won, spin again until you win!
    while( machine01.jackpot() == false ) {
      System.out.println( "Your spin..." + "\t" + machine01 );
      System.out.println( "LOSE\n" );
      machine01.spinOnce();
    }

    System.out.println( "====================================" );
    System.out.println( "Your spin..." + "\t" + machine01 );
    System.out.println( "JACKPOT!\n" );

  }//end main

}//end class Slots
