//EXERCICIO 32
import java.util.Scanner;

public class QtdCombustivel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtdAlcool=0, qtdGasolina=0, qtdDiesel=0, opcao=0;
        float qtdLitrosAlcool=0, qtdLitrosGasolina=0, qtdLitrosDiesel=0;

        for(int i=0; i<5; i++){
            System.out.println("Álcool: 1 | Gasolina: 2 | Diesel: 3");
            System.out.println("");
            System.out.println("Iforme o tipo de combustível: ");
            System.out.println("Iforme a quatidade de litros: ");
            opcao = input.nextInt();
            
            if(opcao ==1){
                qtdLitrosAlcool += input.nextFloat();
                qtdAlcool++;
            }else if( opcao ==2){
                qtdLitrosGasolina += input.nextFloat();
                qtdGasolina++;
            }else if( opcao ==3){
                qtdLitrosDiesel += input.nextFloat();
                qtdDiesel++;
            }else {
                System.out.println("Informe uma opcao válida: ");
            }
            
        }
        input.close();
            System.out.println("1. Álcool: "+qtdAlcool+" - "+qtdLitrosAlcool);
            System.out.println("1. Gasolina: "+qtdGasolina+" - "+qtdLitrosGasolina);
            System.out.println("1. Diesel: "+qtdDiesel+" - "+qtdLitrosDiesel);
    }
}
