package ejerciciosBasicos;
import java.util.Scanner;

public class SumaNumNaturales {
    Scanner resultScanner = new Scanner(System.in);
    int resultado = 0;
    public void sumaNumeros(){
        System.out.println("ingrese el numero  hasta el que quiere sume todos los de mas naturales ");
        int numero = resultScanner.nextInt();
        for (int i=0;i<=10; i++ ){
            resultado = resultado + i;
        }
        System.out.println("el resultado de la suma de "+ numero +" es: "+ resultado);

    }

}
