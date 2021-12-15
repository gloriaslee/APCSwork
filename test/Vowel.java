import java.util.Scanner;
public class Vowel{

  private static final String VOWELS = "aeiouAEIOU";

  public static boolean isAVowel( String letter ) {
    return VOWELS.indexOf( letter ) != -1;
  }
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String string = in.nextLine();
    System.out.println(isAVowel(string));
  }
}
