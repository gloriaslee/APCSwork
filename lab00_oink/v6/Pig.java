/*
Gloria Lee (Team Asphyxiation with Neil Lin and Ethan Lam)
APCS
L00: Etterbay Odingcay Oughthray Ollaborationcay
2021-11-08
time spent: 4 hrs

DISCO:
QCC:
HOW WE UTILIZED SCANNER DEMO (v7): After puzzling through the scanner for half an hour, we were unable to figure out how to get the scanner in main 
	to achieve compilability. We used the scanner demo to try to understand the syntax of scanner, and we learned the syntax to create a new scanner. We 
	think that System.in would be the input inputted into the System, which is why we tried to replace System.in with words.in, but I don't think that worked.
	
WHAT CAUSES THE RUNTIME ERROR IN THE SCANNER DEMO: We were also unsure about this because we were unsure about what the syntax of Scanner's code meant exactly in the first place, 
	and we weren't sure about the run time error either because there was no error message seen except for there being no way to break out of the Scanner code, except for control C,
	which meant this this could have been the runtime error. Anyway, we hypothesized that this error could have been caused by the two print statements, which although it seems
	unnecessary, it doesn't seem to be the culprit of the error, but this was the best answer we could come up with.
NEW IN v6: Successful implementation of ways to account for both y vowel/nonvowel cases and punctuation cases.
/***	
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 ***/
*/

public class Pig {

    private static final String VOWELS = "aeiouAEIOU";
    private static final String CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String PUNCS = ".,:;!?";



  /**
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p") -> false
  **/
  public static boolean hasA( String w, String letter ) {

    return w.indexOf(letter) != -1;
  }//end hasA()


  /**
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    **/
  public static boolean isAVowel( String letter ) {
    return VOWELS.indexOf( letter ) != -1;
  }


  /**
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    **/
  public static int countVowels( String w ) {
    int counter = 0;
    String letter;
    for(int i=0;i<w.length();i++){
      letter=w.substring(i,i+1);
      if(isAVowel(letter)==true){
        counter+=1;
      }
    }
    return counter;
  }


  /**
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz") -> false
    **/
  public static boolean hasAVowel( String w ) {
    return countVowels(w) > 0;
  }





  /**
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    **/
  public static String allVowels( String w ) {

    String ans = " "; //init return String

    for( int i = 0; i < w.length(); i++ ) {

      if ( isAVowel( w.substring(i,i+1) ) )
        ans += w.substring( i, i+1 ); //grow the return String
    }
    return ans;
  }


  /**
    String firstVowel(String) -- returns first vowel in a String
    pre:  w != null
    post: firstVowel("") --> ""
    firstVowel("zzz") --> ""
    firstVowel("meatball") --> "e"
    **/
  public static String firstVowel( String w ) {

    String ans = "";

    if ( hasAVowel(w) ){ //Q: Why this necess?
      ans = allVowels(w).substring(1,2);
    }
    return ans;
  }


  /**
    boolean beginsWithVowel(String) -- tells whether a String begins with a vowel
    pre:  w != null and w.length() > 0
    post: beginsWithVowel("apple")  --> true
    beginsWithVowel("strong") --> false
    **/
  public static boolean beginsWithVowel( String w ) {
    return isAVowel( w.substring(0,1) );
  }


  /**
    String engToPig(String) -- converts an English word to Pig Latin
    pre:  w.length() > 0
    post: engToPig("apple")  --> "appleway"
    engToPig("strong") --> "ongstray"
    engToPig("java")   --> "avajay"
    **/
  public static String engToPig( String w ) {
    String ans = "";
    if(countVowels(w)==0){ //yyy -> yyyay
      ans = w + "ay";
    }
    else if ( beginsWithVowel(w) ){ //yellow -> ellowyay
      ans = w + "way";
    }
    else if (w.indexOf("y")!=0 && w.indexOf("Y")!=0 && w.indexOf("y")>w.indexOf(firstVowel(w))) {
  	//first letter is NOT y AND there is a y in the string and the index of y is greater than the index of any vowel //dysentery -> ysenteryday
      ans = w.substring(w.indexOf("y")) +  w.substring(0,w.indexOf("y")) + "ay";
    }
    else {
      int vPos = w.indexOf( firstVowel(w) );
      ans = w.substring(vPos) + w.substring(0,vPos) + "ay";
    }

    return ans;
  }

  public static String pigToCapitals(String w){
    for(int i=0;i<w.length();i++){
      if(isACapital(w.substring(i,i+1))){
        String upper = w.substring(0,1);
        String lower = w.substring(1,w.length());
        w =  upper.toUpperCase()+lower.toLowerCase();
      }
    }
    return w;
  }

  // code to be added to your growing Pig Latin translator
	//capital letters (precond: letter is 1 character long)
  public static boolean isACapital( String letter ) {
    return CAPS.indexOf( letter ) != -1;
  }


  public static String ifPunc(String letter){
			String ans = "";
      if(PUNCS.indexOf(letter.substring(letter.length()-1))!= -1 ){
      	ans = pigToCapitals(engToPig(letter.substring(0,letter.length()-1)) + letter.substring(letter.length()-1));
      }
    	else{
        ans = pigToCapitals(engToPig(letter));
      }
    	return ans;
  }

  public static void main( String[] args ) {


    for( String word : args ) {
      System.out.println( "allVowels \t" + allVowels(word).substring(1) );
      System.out.println( "firstVowels \t" + firstVowel(word) );
      System.out.println( "countVowels \t" + countVowels(word) );
      System.out.println( "engToPig \t" + engToPig(word) );
      System.out.println("pigToCapitals \t" + pigToCapitals(engToPig(word)));
      System.out.println("ifPunc \t" + ifPunc(word));
      System.out.println( "---------------------" );
    }
  }//end main()

}//end class Pig
