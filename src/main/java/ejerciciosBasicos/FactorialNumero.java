package ejerciciosBasicos;
import java.util.Scanner;

public class FactorialNumero {
    Scanner resultScanner = new Scanner(System.in);
    int resultado = 0;
    public void factorialNumero(){// metodo factorialNumero de la clase FactorialNumero
        System.out.println("ingrese el num del que quiere el factorial:");
        int numero = resultScanner.nextInt();
        int resultado=1;

        for (int i=1; i<=numero;i++){

            resultado *= i;

        }
            System.out.println("el resultado es: "+ resultado);
    }
}
