public class Main {

   public static void main(String []args) {
      // One = sign ASSIGNS a value to a variable
      int age = 15;
      int year = 14;
      // Two == signs is checking for EQUALITY
      boolean match = (age == year); // returns a BOOLEAN
      System.out.println("Does age match year?" + match);

      year = 15; // RE-ASSIGNING
      System.out.println(age == year); // true

      // != means "is NOT equal to"
      System.out.println(age != year); // false

      // RELATIONAL OPERATORS 
      // used in boolean expressions
      double pi = 3.14159;
      System.out.println(pi > 0); // checking if positive
      System.out.println(pi < 0); // checking if negative
      System.out.println(pi >= 3.14); // true
      System.out.println(pi <= 10); // true


      // IF STATEMENTS
      boolean isCold = false;
      if (isCold == true) {
         System.out.println("Bring a jacket!");
      }
      System.out.println("Enjoy your walk!");

      // Magic-8 Ball Mini Program
      // 1. Generate random integer between 1-8
      double randDoub = Math.random() * 8 + 1; // adjust the output range
      int randInt = (int) randDoub; // CASTING types

      // 2. Use that number in 8 if statements to print a different response
      if (randInt == 1) {
         System.out.println("It's not looking good buddy...");
      }
      // every "if block" is like starting a new line of questioning
      if (randInt == 2) {
         System.out.println("Oh for sure!");
      }

      // TWO-WAY SELECTION: IF block coupled with an ELSE block
      // is like "if this is true, do something", OTHERWISE, "do something else"
      int myAge = 16;
      // BOOLEAN EXPRESSION here is "myAge >= 17"
      if (myAge >= 17) {
         System.out.println("You can get your license in NY!");
      }
      // else is coupled with the if statement above
      // so you do NOT need to specify a CONDITION/EXPRESSION
      else {
         System.out.println("You're too young to drive in NY");
      }
      
      // MULTI-WAY SELECTION
      System.out.println("What type of costume are you thinking of? (scary, cute, funny, other)");
      String choice = "scary";
      // Always start a "decision" with an IF statement
      if (choice.equals("scary")) {
         System.out.println("You should be a FINAL EXAM!");
      }
      // You can include as many ELSE IF statements as you want
      // but they must follow an initial IF statement
      else if (choice.equals("cute")) {
         System.out.println("You should be a PRINCESS!");
      }
      else if (choice.equals("funny")) {
         System.out.println("You should be a INFLATABLE DINOSAUR!");
      }
      // Provide a "catch-all" choice in case earlier conditions are not met
      else {
         System.out.println("I literally don't know. Look on Pinterest?");
      }

   }
}
