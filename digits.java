import java.util.Scanner;
class Hello{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter a value");
int num=s.nextInt(),temp=num,count=0;
for(;num>0;num/=10)
{
int rem=num%10;

count++;
}
System.out.println("no of digits in"+temp+" is"+count);
}
}
