import java.util.Scanner;
class Hello{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter a value");
int num=s.nextInt(),tem=num,count=0,sum=0;
for(;num>0;num/=10)
{
int rem=num%10;
count++;
}
num=temp;
for(;num>0;num/=10)
{
 int rem=num%10;
int power=(int)Math.pow(rem,count);
sum+=power;
}
System.out.println(temp==sum?"Arrmstrong":"not Arrmstorng");
}
}

