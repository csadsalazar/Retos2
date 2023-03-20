import java.util.Scanner;
public class Reto2{
    public static void main(String[] args) {
        try (Scanner Lectura = new Scanner(System.in)) {
            int i,n;
            String ganador;
            double tiempmej;
            System.out.println("Cantidad de Competidores ");
            n = Lectura.nextInt();
            String[] nombres = new String[n];
            double[] tiempos = new double[n];
            for (i = 0; i < n; i++) {
                System.out.println("Nombre del competidor " + (i+1));
                nombres[i] = Lectura.next();
                System.out.println("Tiempo del competidor " + (i+1));
                tiempos[i] = Lectura.nextDouble();
            }
            System.out.println();
            System.out.println("Tabla de Competidores");
            for (i = 0; i < n; i++) {
                System.out.println("Nombre "+ nombres[i] +"  "+"Tiempo "+ tiempos[i]);
            }

            ganador = nombres[0];
            tiempmej = tiempos[0];

            for (i = 1; i < n; i++) {
                if (tiempos[i] < tiempmej) {
                    ganador = nombres[i];
                    tiempmej = tiempos[i];
                }
            }

            System.out.println();

            System.out.println("El ganador es el competidor " + ganador + " con un tiempo de " + tiempmej);

        }
    }
}