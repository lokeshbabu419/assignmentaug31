*** Write a code to mask a given string.

  for e.g 

    Malladi Lokesh Babu
    MaXXXXX LoXXXX BaXX


public class Masking {
public static void main(String[] args) {
String str = "Malladi Lokesh Babu";
String[] ar = str.split(" ");
String str1 = "";
int n=ar.length; 
for(int i=0;i<n;i++) 
{
for(int j=0;j<ar[i].length();j++)
{
if(j>1) 
{
str1=str1+"X";
}
else
{
char s=ar[i].charAt(j);
str1=str1+s;
}
}
str1=str1+" ";
}
System.out.println("Original String is:\t"+str);
System.out.println("Masked String is\t"+str1);
}}
	