package ejerciciosBasicos;
import java.util.Scanner;

public class ParesImpares {
    Scanner resultScanner = new Scanner(System.in);
    public void detectarParesImpares(){
        System.out.println("ingrese el numeroa verificar si es par o impar");
        double numero = resultScanner.nextDouble();
        double modulo = numero % 2;
        String resultado = (modulo == 0)? "es par ": "es impar";
        System.out.println("el numero es: "+resultado);
    }
}
