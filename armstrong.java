public class armstrong{
public static void main (String args[]){
int num=153;
int sum=0;
int rem, number=num;
while(num>0){
rem=num%10;
sum=sum+(rem*rem*rem);
num=num/10;
}
if(number==sum){
System.out.println("Armstrong");
}
else{
System.out.println("not Armstrong");
}
}
}