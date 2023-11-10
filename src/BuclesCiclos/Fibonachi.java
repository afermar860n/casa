package BuclesCiclos;
import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {


        int i=0, a = 0, b = 1, c = 0;

        System.out.println("bucle for: ");
        for (i = 0; i < 10; i++) {
            if (i < 9){
                System.out.print(a + ",");
                c = a + b;
                a = b;
                b = c;
            }else{
                System.out.print(a);
            }
        }

        System.out.println(""); //salto de linea
        i = 0;
        b = 1;
        a = 0;
        c = 0;

        System.out.println("bucle while: ");
        while (i < 10){
            if (i < 9){
                System.out.print(a + ",");
                c = a + b;
                a = b;
                b = c;
            }else{
                System.out.print(a);
            }
            i++;
        }

        System.out.println(""); //salto de linea
        i = 0;
        b = 1;
        a = 0;
        c = 0;

        System.out.println("bucle do while: ");
        do{
            if (i < 9){
                System.out.print(a + ",");
                c = a + b;
                a = b;
                b = c;
            }else{
                System.out.print(a);
            }
            i++;
        }while(i < 10);

    }
}
