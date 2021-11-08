public class xyzThere{
  public static boolean xyzThere(String a){
    int length = a.length()-2;
    for(int i = 0;i<length;i++){
      if(a.charAt(i)=="x"&&a.charAt(i+1)=="y"&&a.charAt(i+2)=="z"){
        if(i==0||a.charAt(i-1)!=="."){
          return true;
        }
      }
      else{
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args){
    System.out.println(xyzThere("hellothere.xyz"));
    System.out.println(xyzThere("hellotherexxyz"));
}
