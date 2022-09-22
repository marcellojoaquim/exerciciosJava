//EXERCICIO 42

import java.util.Scanner;

public class Porcentagem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precoAntigo, precoNovo, aux, aumento;

        System.out.println("Informe o preço antigo:");
        precoAntigo = input.nextDouble();
        System.out.println("Inrforme o novo preço:");
        precoNovo = input.nextDouble();
        input.close();

        aux = (precoNovo*100)/precoAntigo;
        aumento = aux-100;

        System.out.println("QUE ABSURDO! O PREÇO DO CINEMA SUBIU "+aumento+"% !!!");

    }
}
