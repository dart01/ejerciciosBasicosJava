package ejerciciosBasicos;
import java.util.Scanner;

public class MaximoComunDivisor {
    Scanner entriScanner = new Scanner(System.in);
    public void maximoComunDivisor(){
        System.out.println("ingrese primer num");
        int a = entriScanner.nextInt();
        System.out.println("ingrese segundo num");
        int b = entriScanner.nextInt();
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("el mayor es:"+a);


    }
}
