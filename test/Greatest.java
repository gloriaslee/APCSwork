public class Greatest{
  private static int[] arr = {2,5,7,4,2};

  public static int greatest(int[] array){
    int greatest = array[0];
    for(int i:array){
      if(i>greatest){
        greatest = i;
      }
    }
    return greatest;
  }
  public static void main(String[] args){
    System.out.println(greatest(arr));
  }
}
