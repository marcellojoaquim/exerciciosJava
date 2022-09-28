// EXERCICIO 26
import java.util.Scanner;

public class qtdBrinquedos {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtdBrinquedos =0, idade;
        float altura;

        System.out.println("Informe a altura e idade:");
        altura = input.nextFloat();
        idade = input.nextInt();
        input.close();

        if((altura >= 1.5)&&(idade >= 12)){
            qtdBrinquedos++;
        }
        if((altura >= 1.4)&&(idade >= 14)){
            qtdBrinquedos++;
        }
        if((altura >=17)||(idade >= 16)){
            qtdBrinquedos++;
        }

        System.out.println(qtdBrinquedos);

    }
}
