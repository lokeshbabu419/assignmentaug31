*** Create a class Student with following attributes
   
   Student
 =============
   rollNo int
   studentFirstName String
   studentLastName  String
   studentAge int
 
 Override toString(),equals(),hashCode() without using tool.



class Student1{
int rollNo;
String studentFirstName;
String studentLastName;
int studentAge;
public Student(int rollNo, String studentFirstName, String studentLastName, int studentAge) {
this.rollNo = rollNo;
this.studentFirstName = studentFirstName;
this.studentLastName = studentLastName;
this.studentAge = studentAge;
}
@Override
public int hashCode() {
return rollNo;
}
@Override
public boolean equals(Object obj) {
if(obj == this)
return true;
if(!(obj instanceof Student))
return false;
Student s = (Student) obj;
return rollNo==s.rollNo;}
@Override
public String toString() {
return rollNo+" "+studentFirstName+" "+studentLastName+" "+studentAge;
}	
}
public class Student {
public static void main(String[] args)
{
Student s1= new Student(1,"Lokesh","Malladi",23);
Student s2= new Student(2,"Shashi","Gopavaram",23);
System.out.println(s1);
System.out.println(s2);
System.out.println(s1.hashCode()+" "+s2.hashCode());
System.out.println(s1.equals(s2));
}
}