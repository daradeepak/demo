importjava.util.Scanner;
class Hello{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value");
int num=s.nextInt();
while(num<0)
{
int rem=num%10;
System.out.println(rem);
num=num%10;
}
}
}