package ejerciciosBasicos;
import java.util.Scanner;

public class TablaMultiplicar {
    Scanner resultScanner = new Scanner(System.in);
    public void tablaMultiplicar(){
        System.out.println("ingrese el num qu quiere se imprima su tabla multiplicar:");
        double numero = resultScanner.nextDouble();
        double resultado=0;
        for (int i=0; i<=9;i++){
            resultado = numero * i;
            System.out.println(numero +" * "+i+"="+resultado);
        }

    }
}
