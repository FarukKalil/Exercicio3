package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
                double n1, n2, subtração;
            Scanner captura = new Scanner (System.in);
        System.out.println("Digite um número: ");
            n1 = captura.nextDouble();
            System.out.println("Digite outro número: ");
            n2 = captura.nextDouble();
            
            subtração = n1 - n2;
            
            System.out.println("A soma de "+n1+" + "+n2+" é "+subtração);
    }
    
}
