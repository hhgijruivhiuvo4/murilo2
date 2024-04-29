package logica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os valores (digite um número negativo ou zero para encerrar):");
        
        while (true) {
            System.out.print("Digite um número: ");
            double numero = scanner.nextDouble();
            
            if (numero <= 0) {
                System.out.println("Encerrando o programa...");
                break;
            }
            
            double quadrado = Math.pow(numero, 2);
            double cubo = Math.pow(numero, 3);
            double raizQuadrada = Math.sqrt(numero);
            
            System.out.println("Número: " + numero);
            System.out.println("Quadrado: " + quadrado);
            System.out.println("Cubo: " + cubo);
            System.out.println("Raiz quadrada: " + raizQuadrada);
            System.out.println();
        }
        
        scanner.close();
    }
}
