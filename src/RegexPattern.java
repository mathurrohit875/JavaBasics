import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPattern {

  public static void main(String[] args) {
    dot("Hepklo Heoalo");
    caret("Pello Horld");
    caret("Horld Hello");
    dollar("Hello World");
    wordBoundary("hello the world is e the good");
    wordCharacter("Your request with Wallet Advance no: ROIE05667 has been processed successfully.");
    Digit("abc123 bcd4596");

  }

  public static void dot(String st) {
    /*This is example of Dot(.) regex which means that this pattern will only match
    when there is a matching between the given string.
    for example:
    if string is "hello" and we want to check that the word should start with
    He then has any character, number or anything in between and then letter lo
    So we can also use as many dot(.) in between as per the requirement.
    The dot represent the characters or number or anything between the given characters
    */
    //String str = "Hepklo Heoalo";
    Pattern pattern = Pattern.compile("He..lo");
    Matcher matcher = pattern.matcher(st);
    while (matcher.find()) {
      System.out.println("matching text: " + matcher.group());
    }
  }

  public static void caret(String st) {
    /*
    The caret (^) is used in regular expressions to match the start of a string.
     It ensures that the pattern must appear at the beginning of the string.
     This means that when caret is used it will match the start string or character and prints that..
     like if i use "^h" and the string is hello then it will print h
     */

    Pattern pattern = Pattern.compile("^P");
    Matcher matcher = pattern.matcher(st);
    while (matcher.find()) {
      System.out.println("caret matches: " + matcher.group());

    }

  }

  public static void dollar(String st) {

    /*
    The dollar sign ($) in regular expressions is used to match the end of the string.
     It asserts that the pattern you're searching for must occur at the end of the string.
     this means that if the string is hello world and i'm checking world$ then it will print world
     but if i check ld$ then it will print ld
     */

    Pattern pattern = Pattern.compile("ld$");
    Matcher matcher = pattern.matcher(st);
    while (matcher.find()) {
      System.out.println("dollar matches: " + matcher.group());
    }

  }

  public static void wordBoundary(String st) {

    /*
    The \\b in regular expressions represents a word boundary. A word boundary matches the position between a
     word character (like letters or digits) and a non-word character (like spaces, punctuation, or the start/end of the string).
     What is a Word Boundary (\\b)?
      Word characters: [a-zA-Z0-9_]
      Non-word characters: Anything that is not a letter, digit, or underscore (like spaces, punctuation, etc.)
      Now if use \\bthe\\b which means that it will print "the" word as many times as it appears in the string.
      It will take a complete word in between.. it will not take any character in between..
     */
    Pattern pattern = Pattern.compile("\\be\\b");
    Matcher matcher = pattern.matcher(st);
    while (matcher.find()) {
      System.out.println("word boundary: " + matcher.group());
    }

  }

  public static void wordCharacter(String st) {
    /*
    The \\w in regular expressions matches a word character, which includes:

      Letters (both uppercase and lowercase)
        Digits (0–9)
        Underscores (_)
        It essentially matches any character that is part of a "word" in programming,
         making it useful when you want to match words or parts of words that consist of these characters.

        What does \\w match?
          [a-zA-Z0-9_] — Any letter (both upper and lower case), any digit, or an underscore.
     */
    Pattern pattern = Pattern.compile("RO\\w+");
    Matcher matcher = pattern.matcher(st);
    while (matcher.find()) {
      System.out.println("wordCharacter: " + matcher.group());
    }

  }

  public static void Digit(String st) {
/*
              Digit (0-9)
              Pattern: \\d{3}
              Explanation: \\d matches any digit, and {3} specifies exactly 3 digits.
              Example:
              Input: "123", "abc123"
              Matches: "123" (it matches exactly three digits in a row)

 */
    Pattern pattern = Pattern.compile("\\d{4}");
    Matcher matcher = pattern.matcher(st);
    while (matcher.find()) {
      System.out.println("Digit: " + matcher.group());
    }

  }

  public static void Whitespacecharacter(String st) {

  }
}

