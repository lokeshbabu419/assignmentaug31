** Check if given string starts with A and Endwith t.


import java.util.Scanner;
public class Words
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a String: ");
String str = sc.nextLine();
if((str.startsWith("A")) && (str.endsWith("t"))){
System.out.println("Given string "+str+"starts with A and ends with t");
}else{
System.out.println("Wrong input");
}
}
}