// Great Nice Jingles (Nafiz Labib + Martha, Julia Kozak + Flopsy, Gloria Lee + Flounder)
// APCS pd8
// L05 -- pulling it together
// 2022-02-03r
// time spent: 1 hr



/**
   An AP-style question, for practice...
   GOAL: Write the StatPrinter class below.
   WHAT YOU NEED TO KNOW:
   The StatPrinter Object receives an
   ArrayList of nonnegative integers, then builds a frequency ArrayList in which
   the index values are the data and the entry at the index is the frequency.
   For example, if the received data is    2,3,2,5,1,3    then the frequency
   list would be [0,1,2,2,0,1]. This is read as 0 zeroes, 1 one, 2 twos,
   2 threes, 0 fours, 1 five. The size of the frequency list is the equal to
   the maximum value of the data.
   A capability of the class is to calculate local modes from the frequency
   list. A local mode is a value that is greater than the value at index-1
   and greater than the value at index+1. A local mode is never at the end
   points of the list. For example, if the frequency list is [1,2,1,4,2,3,5]
   then the local modes are 2 and 4.
   This class is also capable of printing a histogram of the frequencies, using
   '*'s to indicate a frequency amount. To print a histogram, the user specifies
   the longest sequence of '*'s used and then all other values are printed in
   proportion to this value. For example, if longest bar is 10 and the frequency
   list is [1,2,1,4,2,3,5] then the histogram printed looks like this:
   0 : **
   1 : ****
   2 : **
   3 : ********
   4 : ****
   5 : ******
   6 : **********
   For each method, state run time efficiency using Big O notation.
   TIPS FOR AWESOME:
   * Keys to Success were so named (by Thinkeren) for a reason.
   * Look over all fxns, think a bit, decide which to tackle first.
   ( Simplest?  Prerequisites? . . . )
   * Develop 1 fxn at a time, test it, then move to next.
   * Initially, what extra code do you need to get past compiler?
   **/

import java.util.ArrayList;


public class StatPrinter
{
  // instance variable for frequencies of each integer in input ArrayList
  private ArrayList <Integer> _frequency;


  //*************** QUESTION 02 **************************
  //precond:  data.size() > 0, each entry b/t 0,100 inclusive
  //postcond: _frequency.size() set to max(data) + 1
  //          _frequency.get(i) returns frequeny of i in data
  //eg, for data [2,3,2,5,2,3]
  //  _frequency would be [0,0,3,2,0,1]
  public StatPrinter( ArrayList<Integer> data )
  {

    _frequency = new ArrayList<Integer>(max(data) + 1);
    for (int i = 0; i < max(data) + 1; i++){
      int amount = 0;
      for(int j = 0; j < data.size(); j++){
        if (data.get(j) == i) {
          amount++;
        }
      }
      System.out.println("Setting...");
      System.out.println("index "+i+", amount: "+amount);
      _frequency.add(amount);
    }

  }
  //RUNTIME COMPLEXITY: n^2
   //REASONING: There are 2 for loops, meaning that there's iteration through the array for each element of the original ArrayList, so it's similar to a quadratic.

  //*************** QUESTION 01 **************************
  //precond:  data.size() > 0
  //postcond: returns largest integer in data
  public Integer max( ArrayList <Integer> data )
  {
   Integer max = data.get(0);
      for (int i = 1; i < data.size(); i++){
        if (data.get(i) > max){
          max = data.get(i);
        }
      }
      return max;
  }
  //RUNTIME COMPLEXITY: n
  //REASONING: The amount of time this takes will depend on the number of elements in ArrayList data (linear).


  // *************** QUESTION 03 **************************
  // postcond: returns true if i > 0 and i < _frequency.size() - 1
  //          and _frequency.get( i - 1 ) < _frequency.get( i )
  //          and _frequency.get( i + 1 ) < _frequency.get( i )
  //          Otherwise, returns false
  // eg, for _frequency [1,2,1,5,5,8,2,4]
  //    2 and 8 are local modes,so
  //    isLocalMode(0) -> false
  //    isLocalMode(1) -> true
  //    isLocalMode(5) -> true
  ArrayList<Integer> _localModes = new ArrayList<Integer>();
   public boolean isLocalMode( int i )
  {
    if(i==0||i==_frequency.size()-1){
      return false;
    }
    if(_frequency.get(i-1)<_frequency.get(i) && _frequency.get(i+1)<_frequency.get(i)){

      return true;
    }
    return false;
  }
  //RUNTIME COMPLEXITY: 1
    //REASONING: Because the method searches at a specific index, length of ArrayList doesn't affect runtime.


  //*************** QUESTION 04 **************************
  //postcond: returns list of modes in _frequency
  public ArrayList<Integer> getLocalModes()
  {
    ArrayList<Integer> ret = new ArrayList<Integer>();
   for (int i=0; i<_frequency.size(); i++) {
     if (isLocalMode(i)) {
       ret.add(i);
     }
   }
   return ret;
 }
 //RUNTIME COMPLEXITY: n
  //REASONING: The amount of time this takes will depend on the number of elements in ArrayList _frequency (linear).

  //*************** QUESTION 05 **************************
  //precond:  longestBar > 0
  //public void printHistogram( int longestBar )
  public void printHistogram( int longestBar )
 {
   int max = max(_frequency);
   double ratio = (double)longestBar / max;
   for (int i=0; i<_frequency.size(); i++) {
     int numStars = (int)(_frequency.get(i) * ratio);
     System.out.print(i + " : ");
     for (int j=0; j<numStars; j++) {
       System.out.print("*");
     }
     System.out.println();
   }
 }
 //RUNTIME COMPLEXITY: n
 //REASONING: The amount of time this takes will depend on the number of elements in our _frequency ArrayList.

}//end class StatPrinter
