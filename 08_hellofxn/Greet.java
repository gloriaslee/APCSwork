/*
 * Gloria Lee
 * APCS
 * HW08 -- Refactor Freshie Zero/Beginner Java/Copy function, hardcode, and single function call
 *2021-09-30
 
 DISCOVERIES
 - I was prompted this while running git commit on git bash
 Author identity unknown

*** Please tell me who you are.

Run

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

to set your account's default identity.

UNRESOLVED QUESTIONS
Could this hw have been done using an array of names and a for loop that goes through each name?
 */


public class Greet{
      public static void main(String[] args){
              greet("Louis");
              greet("Elise");
              greet("Adam");
      }
      public static void greet(String a){
              System.out.println("Why, hello there, "+a+". How do you do?");
      }
}
