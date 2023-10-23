import java.util.Scanner;
public class operaciones {

    public static void main(String[] args) {


        int numUno=0, numDos=0, resultado=0, parametro=0;

        System.out.println("introduzca: 1 para+, 2 para -, 3 para* y 4 para/");
        Scanner s = new Scanner(System.in);
        parametro = s.nextInt();

        System.out.println("introduzca primer numero");
        numUno = s.nextInt();

        System.out.println("introduzca: numero dos");
        numDos = s.nextInt();

        switch (parametro) {
            case 1:
                resultado = numUno + numDos;
                System.out.println("el resultado de la suma es igual= " + resultado);
                break;
            case 2:
                resultado = numUno - numDos;
                System.out.println("el resultado de la resta es igual= " + resultado);
                break;
            case 3:
                resultado = numUno * numDos;
                System.out.println("el resultado de la multiplicacion es igual= " + resultado);
                break;
            case 4:
                resultado = numUno / numDos;
                System.out.println("el resultado de la division es igual= " + resultado);
                break;

            default: System.out.println("error, la opcion no existe");
            break;
        }
    }
}
