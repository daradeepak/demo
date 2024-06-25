class Hello{
public static void main(String args[]){
int num=2,start=1,count=0;
while(start<=num/2)
{
if(num%start==0)
count++;
start++;
}
System.out.println(count==1?"prime number":"not prime number");
}
}