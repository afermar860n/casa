import java.util.Scanner;

public class VacacionesCocaCola {
    public static void main(String[] args) {

        System.out.println("*******************************************");
        System.out.println("****** Bienvenido a Coca Cola S.A. ********");
        System.out.println("*******************************************");


        String nombre = "";
        int claveDepartamento = 0;
        int antiguedad = 0;

        Scanner s = new Scanner(System.in);

            System.out.println("Escribe tu nombre: ");
            nombre = s.nextLine();
            System.out.println("");

            System.out.println("Escribe tu Clave de departamento (1-Camionero, 2-Comercial, 3-Gestor: ");
            claveDepartamento = s.nextInt();
            System.out.println("");

            System.out.println("Escribe tu antigueadad: ");
            antiguedad = s.nextInt();
            System.out.println("");

                if (claveDepartamento == 1) {
                    if (antiguedad == 1) {
                        System.out.println("El trabajador " + nombre + " tiene derecho a 6 dias de vacaciones");
                    }else if (antiguedad >= 2 && antiguedad <=6) {
                        System.out.println("El trabajador " + nombre + " tiene derecho a 14 dias de vacaciones");
                    }else if (antiguedad >= 7){
                        System.out.println("El trabajador " + nombre + " tiene derecho a 20 dias de vacaciones");
                    }


                } else if (claveDepartamento == 2) {
                    if (antiguedad == 1) {
                        System.out.println("El trabajado r" + nombre + " tiene derecho a 7 dias de vacaciones");
                    }else if (antiguedad >= 2 && antiguedad <=6) {
                        System.out.println("El trabajador " + nombre + " tiene derecho a 15 dias de vacaciones");
                    }else if (antiguedad >= 7){
                        System.out.println("El trabajador " + nombre + " tiene derecho a 22 dias de vacaciones");
                    }

                } else if (claveDepartamento == 3) {
                    if (antiguedad == 1) {
                        System.out.println("El trabajador " + nombre + " tiene derecho a 10 dias de vacaciones");
                    }else if (antiguedad >= 2 && antiguedad <=6) {
                        System.out.println("El trabajador " + nombre + " tiene derecho a 20 dias de vacaciones");
                    }else if (antiguedad >= 7){
                        System.out.println("El trabajador " + nombre + " tiene derecho a 30 dias de vacaciones");
                    }

                } else {System.out.println("La clave es incorrecta");
                }



    }
}
