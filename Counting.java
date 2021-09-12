***  In a given String count number of words, count numbers of number.

  "12,RutherFord Building,Lake Street,Chichago-29"




import java.io.FileReader;
import java.io.StreamTokenizer;

public class Counting {
public static void main(String[] args) {
int word = 0, number = 0;
StreamTokenizer s1 = new StreamTokenizer(new FileReader("C:\Users\lokesh.babu\Documents\assignment-sep06\input.txt"));
while (s1.nextToken() != StreamTokenizer.TT_EOF) {
if (s1.ttype == StreamTokenizer.TT_WORD)
word++;
else if (s1.ttype == StreamTokenizer.TT_NUMBER)
number++;}
System.out.println("Number of words in file: " + word);
System.out.println("Number of numbers in file: " + number);	  
}
}