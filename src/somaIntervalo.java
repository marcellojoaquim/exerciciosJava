//EXERCICIO 30
import java.util.Scanner;

public class somaIntervalo {
    int m=0, n=0;
    public static int metodo(int m, int n){
        int soma=0, j=0;
        if(m<n){
            for(j =m; j<=n;j++){
                soma += j;
            }
        }else{
            for(j =n; j<=m;j++){
                soma += j;
            }
        }      
        return soma;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        somaIntervalo[] vet = new somaIntervalo[3];
        
        System.out.println("Informe tres pares de valores.");
        for(int i=0; i<vet.length; i++){
            vet[i] = new somaIntervalo();
            vet[i].m = input.nextInt();
            vet[i].n = input.nextInt();
        }
        input.close();

        for(int i=0; i<vet.length; i++){
            System.out.println(" ");
            if(vet[i].m < vet[i].n){
                for(int j=vet[i].m; j<=vet[i].n;j++){
                    System.out.print(j);
                }
            }else{
                for(int j=vet[i].n; j<=vet[i].m;j++){
                    System.out.print(j);
                }
            }   
            System.out.print(" Soma = "+metodo(vet[i].m, vet[i].n));
        }
        

    }
}
