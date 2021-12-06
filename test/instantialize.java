public class instantialize{
  private int into;
  
  public static void main(String[] args){
    instantialize heyo;
    instantialize wussa = new instantialize();
    wussa.into = 5;
    heyo.into = wussa.into;
  }

}
