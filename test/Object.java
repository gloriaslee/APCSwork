public class Object{
  public static void main(String[] args){
String s1 = "foo"; 
	String s2 = "foo"; 
	String s3 = new String("foo"); 

	System.out.println( s1 ); 
	System.out.println( s2 ); 
	System.out.println( s3 ); 
	System.out.println( s1 == s2 ); 
	System.out.println( s1 == s3 ); 
	System.out.println( s1.equals(s2) ); 
	System.out.println( s1.equals(s3) ); 
	
  }
}
