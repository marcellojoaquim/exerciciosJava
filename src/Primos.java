//EXERCICIO 17
import java.util.Scanner;

public class Primos {
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
        int nCasos, valor;
        System.out.println("Informe o numero de casos: ");
        nCasos = input.nextInt();
        
        for(int i=0; i<nCasos; i++){
            System.out.println("informe um valor inteiro (1 < x >= 107) ");
            valor = input.nextInt();
            int result = Primos.primo(valor);
            if(result == 1){
                System.out.println(valor+" é primo");
            }else{
                System.out.println(valor+" Não é primo");
            }
        }
            
        input.close();
    }
}


