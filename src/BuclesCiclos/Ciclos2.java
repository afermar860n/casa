package BuclesCiclos;

public class Ciclos2 {
    public static void main(String[] args) {

        int i = 1;
        int j = 99;

        System.out.println("Serie con for:");
        for (i = 1; i <= 5; i++){
            if (i < 5) {
                System.out.print(i + ", ");
                System.out.print(j + ", ");
            }else {
                System.out.print(i + ", ");
                System.out.print(j);
            }
         j--; // decrecimiento de J dentro del for
        }
    System.out.println(""); //espacio

        i = 1;
        j = 99;

        System.out.println("Serie con while: ");
        while (i <= 5){
            if (i < 5) {
                System.out.print(i + ", ");
                System.out.print(j + ", ");
            }else {
                System.out.print(i + ", ");
                System.out.print(j);
            }
        i++;  //crecimiento de i en el while
        j--;  //decrecimiento de jota
        }
    System.out.println(""); //espacio

        i = 1;
        j = 99;

        System.out.println("Serie con do-while: ");
        do {
            if (i < 5) {
                System.out.print(i + ", ");
                System.out.print(j + ", ");
            }else {
                System.out.print(i + ", ");
                System.out.print(j);
            }
            i++;  //crecimiento de i en el while
            j--;  //decrecimiento de jota
        }while(i <= 5);
    }
}
