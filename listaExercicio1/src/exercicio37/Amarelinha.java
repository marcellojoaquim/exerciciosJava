package exercicio37;
import java.util.Scanner;

//EXERCICIO 37

public class Amarelinha {

    String NomeJogador, tipo;
    int num=0;

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int  soma=0;
       Amarelinha[] lista = new Amarelinha[2];

       for(int i=0; i<lista.length; i++){
        lista[i] = new Amarelinha();
        System.out.println("Informe o nome do jogador ");
        lista[i].NomeJogador = input.next();
        System.out.println("Informe se Par ou Ímpar");
        lista[i].tipo = input.next();
        System.out.println("Informe o número do jogador ");
        lista[i].num = input.nextInt();
       }
       input.close();

        for(int i=0; i<lista.length; i++){
            soma += lista[i].num; 
        }

        if(soma%2 == 0){
            for(int i=0; i<lista.length; i++){
                if (lista[i].tipo.equalsIgnoreCase("par")){
                    System.out.println(lista[i].NomeJogador);
                }
            }
        }



    }
}
