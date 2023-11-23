import java.util.Scanner;
public class fibonacci
{
   public static void main (String[] args)
   {
       int num1=0; int num2=1; int sum=0; int fiboMax;
       Scanner scan = new Scanner(System.in);
       System.out.println("-----SECUENCIA FIBONACCI-----\n " +
               "Ingrese cual quiere que sea el numero maximo en fibonacci");
       fiboMax = scan.nextInt();
       for (int i = 0; sum < fiboMax; i++)
       {
           System.out.println(sum);
           sum = num1 + num2;
           num1 = num2;
           num2 = sum;
       }
   }
}