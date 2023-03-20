import java.util.Scanner;
public class Reto1{
    public static void main(String[] args) {     
        try (Scanner Lectura = new Scanner(System.in)) {
            double[] notas;
            int cantidadNotas;
            int i;
            double suma=0   ;
            double promedio;
            System.out.println("Ingrese la cantidad de notas ");
            cantidadNotas = Lectura.nextInt();
            notas = new double[cantidadNotas];
            for (i = 0; i < cantidadNotas; i++) {
                System.out.println("Ingrese la nota "+(i+1));
                notas[i] = Lectura.nextDouble();
            }
            for (i = 0; i < cantidadNotas; i++) {
                suma += notas[i];
            }
            promedio = suma / cantidadNotas;
            System.out.println("El promedio es "+promedio);
            if (promedio < 3) {
                System.out.println("Reprobaste");
            } else if (promedio < 4) {
                System.out.println("Pasaste raspando");
            } else {
                System.out.println("Aprobaste con buenos resultados");
            }
        }
        }
    }


