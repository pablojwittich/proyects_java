import java.util.Scanner;
public class NumeroPar
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num;
        num = scan.nextInt();

        if(num % 2 == 0)
        {
           System.out.print("El numero ingresado ("+ num+ ") " + "es PAR");
        } else
        {
            System.out.print("El numero ingresado (" + num + ") " + "es IMPAR");
        }
    }
}
