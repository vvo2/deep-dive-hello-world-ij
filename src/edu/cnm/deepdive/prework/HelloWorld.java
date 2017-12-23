package edu.cnm.deepdive.prework;

public class HelloWorld {

  public static void main(String[] args) {
    salute(salutation(args));
  }
  private static String salutation(String[] args) {
    return "Hello, " +((args.length > 0) ? args[0] : "World");
  }
  private static void salute(String salutation) {
    System.out.println(salutation);
  }
}
