import ejerciciosBasicos.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //captura de informacion por medio del teclado
        Scanner resultScanner = new Scanner(System.in);
        int responseTecla = 0;
        double pi = Math.PI;

        do {
            System.out.println("seleccione una opcion:\n1.Circunferencia y perimetrocirculo \n2.Convertir grados entre Celsius y Fahrenheit \n"+
                "3.Comprobar si un número es par o impar \n4.Sumar los primeros N números naturales\n5.Imprimir la tabla de multiplicar de un número dado\n" +
                    "6.Calcular el máximo común divisor (MCD) de dos números\n7.Calcular el mínimo común múltiplo (MCM) de dos números\n8.Calcular el factorial de un número\n" +
                        "9.Comprobar si un número es primo\n");
             responseTecla = resultScanner.nextInt();

            switch (responseTecla) {
                case 1:
                    PerimetroCirculo perimetro = new PerimetroCirculo();
                    perimetro.perimetro();

                    break;
                case 2:
                    CelsiusAfahrenheit conversion = new CelsiusAfahrenheit();
                    conversion.conversionCelsiusAfahrenheit();
                    break;
                case 3:
                    ParesImpares paresImpares = new ParesImpares();
                    paresImpares.detectarParesImpares();

                    break;
                case 4:
                    SumaNumNaturales sumaNumNaturales = new SumaNumNaturales();
                    sumaNumNaturales.sumaNumeros();
                    break;
                case 5:
                    TablaMultiplicar tablaMultiplicar = new TablaMultiplicar();
                    tablaMultiplicar.tablaMultiplicar();
                    break;
                case 6:
                    MaximoComunDivisor maximoComunDivisor = new MaximoComunDivisor();
                    maximoComunDivisor.maximoComunDivisor();
                    break;
                case 7:

                    break;
                case 8:
                    FactorialNumero factorialNumero=new FactorialNumero();
                    factorialNumero.factorialNumero();
                    break;
                case 9:
                    break;

            }
        }while (responseTecla !=0);




    }
}
