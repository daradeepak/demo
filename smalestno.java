import java.util.Scanner;
class Hellow
{

public static void main(String args[])
  {
    Scanner s=new Scanner (System.in);
    System.out.println("Enter a value");
      int num=s.nextInt(),sml=0,rem=0;
          while(num>0)
           {
               rem=num%10;
              if(rem<sml)
                {
                  sml=rem;
                }
              num=num/10;
            }
           System.out.println(sml);
    }
}
