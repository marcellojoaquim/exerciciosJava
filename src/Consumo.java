// EXERCICIO 6

import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x;
        double y;

        System.out.println("Informe a distancia percorrida: ");
        x = sc.nextInt();
        System.out.println("Informe a qtd de litros: ");
        y = sc.nextDouble();

        double consumo = x/y;

        System.out.printf("%.3f",consumo);
        System.out.print(" Km/l");
        sc.close();
    }
}
