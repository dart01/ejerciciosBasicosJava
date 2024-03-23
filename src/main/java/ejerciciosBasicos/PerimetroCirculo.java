package ejerciciosBasicos;

import java.util.Scanner;

public class PerimetroCirculo {
    //captura de informacion por medio del teclado
    Scanner resultScanner = new Scanner(System.in);
    double pi = Math.PI;
    public void perimetro() {

        System.out.println("ingrese el diametro dela circunferencia:");
        double diametro = resultScanner.nextDouble();
        double perimetro = diametro * pi;
        System.out.println("ingrese el area dela circunferencia:");
        double radio = resultScanner.nextDouble();
        double area = pi * Math.pow(radio,2 ) ;
        System.out.println("el resltado: " + perimetro);
        System.out.println("el resltado: " + area);
    }
}
