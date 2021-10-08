/*
Hamim Seam, Gloria Lee, and Kevin Li - Team Name: Duck Trio
APCS
HW 14:Customize Your Creation/Constructors/Overloading Constructors
2021-10-07
DISCO
While compiling my code, I got the error
BigSib.java:8: error: cannot find symbol
    return hellomsg+", "+b;
           ^
  symbol:   variable hellomsg
  location: class BigSib
I figured out that this was because I did not define hellomsg as a string immediately after class BigSib and instead, I wrote
String hellomsg = a in the contents of the BigSib(String a) constructor. I'm not sure why this doesn't work. I also tried to run 
BigSib.java after compilation and got the message that there must be a main to execute.
QCC
Why is it that when I don't specify String hellomsg outside of the constructor, I get an error message that says that the symbol
hellomsg can't be found when I try to call upon hellomsg in another constructor even when I specify that String hellomsg = a in
the original constructor. Also I'm still unsure on exactly what the difference between public and private is. Why is it that some
methods are static?
*/

class BigSib{
  String hellomsg;
  public BigSib(){
  }
  public BigSib(String a){
    hellomsg = a;
  }
  public String greet(String b){
    return hellomsg+", "+b;
  }
}
/*
Code for BigSib.java for defcon is here:
class BigSib{
  String hellomsg = "Hello there, ";

  public String greet(String a){
    return hellomsg+a;
  }
}
*/
