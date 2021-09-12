 ** Replace a character a with e in following string without using inbuilt method.
  Halo
  Replace character at 3rd index pos in upper case.



public class StringReplace {
public static void main(String[] args) {
String s = "Halo";
char c1='a';
char c2='e';
StringBuilder builder = new StringBuilder();
System.out.println("The String is: "+s);    
for(int i=0;i<s.length();i++){
char ch = s.charAt(i);
if(ch==c1)
{
builder.append(c2);}
else if(ch==Character.toUpperCase(c1)){
builder.append(Character.toUpperCase(c2));}
else if(i==3){builder.append(Character.toUpperCase(ch));}
else{
builder.append(ch);}}
System.out.println("Modified string is :" +builder.toString());
}
}