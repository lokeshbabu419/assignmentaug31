*** In a String find and replace a word.

  e.g Java is Object Oriented. Java is Programming Language.

 Search for a word "Java"
 Replace "Java" with "C++";

 C++ is Object Oriented. C++ is Programming Language.



public class ChangeData {
public static void main(String[] args) {
String str = "Java is Object Oriented. Java is Programming Language.";
System.out.println(str.replace("Java", "C++"));
}
}