// Dada una cadena contar cuantas vocales tiene
import java.util.Scanner;
public class ContadorVocales
{
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       System.out.println("------CONTADOR DE VOCALES-----\n" +
               "Ingresa una frase");
       String s = scan.nextLine();
       char[] c = s.toCharArray();
       int v = 0; 
      System.out.println(c); 
    }
}
