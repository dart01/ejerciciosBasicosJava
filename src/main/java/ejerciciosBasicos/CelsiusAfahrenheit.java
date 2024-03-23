package ejerciciosBasicos;
import  java.util.Scanner;
public class CelsiusAfahrenheit {
    Scanner resultScanner = new Scanner(System.in);
    double fahrenheit;
    double celsius;

    public void conversionCelsiusAfahrenheit(){
        System.out.println("1.celsius a fahrenheit\n2.fahrenheit a celsius");
        int menuConversion = resultScanner.nextInt();
        switch (menuConversion){
            case 1:
                System.out.println("ingrese la temperatura celsius para convertir:");
                celsius = resultScanner.nextDouble();
                fahrenheit =  (celsius * 1.8)+32;
                System.out.println("la temperatura en fahrenheit es:"+ fahrenheit);
                break;
            case 2:
                System.out.println("ingrese la temperatura fahrenheit para convertir:");
                fahrenheit = resultScanner.nextDouble();
                celsius =  (fahrenheit - 32)/1.8;
                System.out.println("la temperatura en celsius es:"+ celsius);
                break;
        }

    }
}
