package edu.cnm.deepdive.prework;  //package edu have a package cnm; packages hierarchy

public class HelloWorld { //must match exact file name from scr\edu\cnm\deepdrive\prework\ HelloWorld.JAVA
//compile makes HelloWorld.class in out\production\deep-dive-hello-world-ij\edu\cnm\deepdive\prework

  public static void main(String[] args) { // public or private is a class; void define main to return nothing
    String target = salutees(args);
    String message = salutation(target);
    salute(message);
    //main is a method name; {variable type is string name is args}; [] is array
  }// all Java app must have "public static void main(String[] args)" to be a Java app

  private static String salutees(String[] args) { //take arrays of string and return a string
    String result = "";
    for (int i = 0; i < args.length; i++) {
      result = result + args[i] + ", ";
    }
    return result;
  } //static remain with static within the class

  private static String salutation(String target) {// whole line is a parameter
    return "Hello, " + (!target.isEmpty() ? target : "World"); //args array mail box start at 0; length is a member
  }  //+ is to concatenate // line 11 is a message

  private static void salute(String salutation) { //name can be rename by right click refactor -> rename
    System.out.println(salutation); //system is a library, println is a method
  }
}

//click on Code -> Reformat Code to re-apply Google style
//stack is a process that takes a parameter and message until all parameter and message are done.