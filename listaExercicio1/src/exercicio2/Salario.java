package exercicio2;

import java.util.Scanner;

public class Salario {
    
    public static void main(String[] args) {
        int diasTrabalhado, horasTrabalhadas;
        double valorHora, salario;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número de dias trabahados: ");
        diasTrabalhado = sc.nextInt();

        System.out.println("Informe a quantidade de horas trabalhada: ");
        horasTrabalhadas = sc.nextInt();

        System.out.println("Informe o valor da hora de trabalho: ");
        valorHora = sc.nextDouble();

        salario = horasTrabalhadas * valorHora;
        
        System.out.println("Numero de dias trabalhado: = "+diasTrabalhado );
        System.out.println("Valor do salário: = R$ "+salario);
        sc.close();

    }
}
