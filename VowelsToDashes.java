import java.io.Console;

public class VowelsToDashes {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Sentence for VowelsToDashes");
    String userInput = myConsole.readLine();
    String output = vowelsToDashes(userInput);
    System.out.println(output);
  }

 public static String vowelsToDashes (String sentence) {
  //  sentence = sentence.replaceAll("/[aeiou]/i", "-");


   sentence = sentence.replaceAll("(?i)a", "-");
   sentence = sentence.replaceAll("(?i)e", "-");
   sentence = sentence.replaceAll("(?i)i", "-");
   sentence = sentence.replaceAll("(?i)o", "-");
   sentence = sentence.replaceAll("(?i)u", "-");

   return sentence;
 }


}
