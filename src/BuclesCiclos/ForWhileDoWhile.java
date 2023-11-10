package BuclesCiclos;

public class ForWhileDoWhile {
    public static void main(String[] args) {


        int i = 0;
        System.out.println(""); //print para dejar espacio

        System.out.println("Serie con for + if,else:");
        for (i = 1; i <=10; i++){
            if (i < 10) {      //Este "if,else" es para imprimir la coma y no imprimirla cuando el ciclo llegue a 10
                System.out.print(i + ", ");
            }else {
               System.out.print(i);
            }
        }


        i = 1;
        System.out.println(""); //print para dejar espacio

        System.out.println("Serie con while + if,else:");
        while (i <= 10){
            if (i < 10) {      //Este "if,else" es para imprimir la coma y no imprimirla cuando el ciclo llegue a 10
                System.out.print(i + ", ");
            }else {
                System.out.print(i);
            }
        i++; // En el while el aumento se pone al final
        }


        i = 1;
        System.out.println(""); //print para dejar espacio

        System.out.println("Serie con do/while + if,else:");
        do{
            if (i < 10) {      //Este "if,else" es para imprimir la coma y no imprimirla cuando el ciclo llegue a 10
                System.out.print(i + ", ");
            }else {
                System.out.print(i);
            }
        i++; // En el do el aumento se pone al final
        }while (i <= 10);
    }
}
