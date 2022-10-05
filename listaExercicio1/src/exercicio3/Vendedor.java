//EXERCICIO 3

import java.text.DecimalFormat;
import java.util.Scanner;

public class Vendedor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        double baseComissao = 0.15, comissao, salarioFixo, montanteDeVendas, salarioFinal;
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Informe o nome do vendendor: ");
        nome = sc.nextLine();

        System.out.println("Informe o salario do vendedor: ");
        salarioFixo = sc.nextDouble();

        System.out.println("Informe o montante de vendas: ");
        montanteDeVendas = sc.nextDouble();

        comissao = montanteDeVendas*baseComissao;
        salarioFinal = comissao + salarioFixo;

        System.out.println("Nome: "+nome);
        System.out.println("Total a receber: "+ df.format(salarioFinal));

        sc.close();

    }
}
