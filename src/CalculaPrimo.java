import java.util.Scanner;

//EXERCICIO 38
public class CalculaPrimo {

        static int primo(int n){
            int aux;
            if(n <=1) return 0;
            for(aux =2; aux*aux <= n; aux++){
                if(n%aux == 0) return 0;
            }
            return 1;
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, result=0;
        System.out.println("Digite um número inteiro!");
        num = input.nextInt();
        input.close();

        result = primo(num);
        if(result == 1){
            System.out.println("É primo!");
        }else{
            System.out.println("Não é primo!");
        }

    }
}
