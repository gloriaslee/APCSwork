import java.util.ArrayList;
public class Arrlist{

  public Arrlist(){
    ArrayList<Integer> arr = new ArrayList<Integer>(10);

  }

public static void main(String[] args){
Arrlist owo = new Arrlist();


  System.out.println(owo);
  }

  public String toString()
  {
    String foo = "[";
    for( int i = 0; i < owo.size(); i++ ) {
      foo += owo[i] + ",";
    }
    if ( owo.length() > 1 )
      //shave off trailing comma
      foo = foo.substring( 0, foo.length()-1 );
    foo += "]";
    return foo;
  }
}
