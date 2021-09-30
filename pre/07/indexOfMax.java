public class indexOfMax{
  public static void main(String[], args){

  }
  public static int indexOfMax(int[] values){
    int maxindex = 0
    for (int a=0;a<values.length;a++){
      if(values[maxIndex]>values[a]){
      }else(values[a]>=values[maxIndex]){
        maxIndex=a
      }

      }
    }
  }


}

You could use an enhanced for loop, but that would be ineffective because in an enhanced for loop, the loop goes through all values of the array instead of going through the index values of the array, meaning you'd have to create another int variable for the index value as it changes, so the enhanced for loop would be less effective than the original for loop.
