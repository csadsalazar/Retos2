import java.util.Scanner;

public class Reto4{
     public static void main(String[] args) {
        Scanner Lectura= new Scanner(System.in);
        int soduko, n, c, i, a, e, fil, col;
        System.out.println("Dijite el tamaño de la fila (Se creara de igual manera las columnas)");
        soduko =Lectura.nextInt();
        int [][] numero = new int[soduko][soduko];
        for (n = 0; n <soduko; n ++){
        for (c = 0; c <soduko; c ++){
        System.out.println("Ingrese el numero de fila "+ (n+1)+ "Ingrese el numero que va a ir en la la columna "+ (c+1));
        numero[n][c]=Lectura.nextInt();
        }
    }
        for (n = 0; n <soduko; n ++){
        for (c = 0; c <soduko; c ++){
            System.out.print(numero[n][c]+ "\t");    
        }
        System.out.println("");
        System.out.println();
    }
        for (i = 0; i <soduko; i ++){
        fil=0;
        for (a = 0; a <soduko; a ++){
        fil += numero[i][a];   
        }
        System.out.print("La suma de fila " + (i+1) + " es" + fil); 
    }
        for (c = 0; c <soduko; c ++){
        col=0;
        for (e = 0;e <soduko; e ++){
        col += numero[c][e];      
            }
        System.out.print("La suma de columna" + (c+1) + " es" + col); 
        }
}
}
