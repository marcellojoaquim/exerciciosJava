// EXERCICIO 44.
import java.util.Scanner;

public class MediaImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] vet = new double[5];        

        double maior=0, menor, diferenca, totalImpares=0, mediaImpares=0, maiorPar=0, contImpar=0;

        System.out.println("Informe cinco valores");
        for(int i=0; i<vet.length; i++){
            vet[i] = input.nextDouble();
        }
        input.close();
       menor = vet[0];

        for(int i=0; i<vet.length; i++){
            if(i==0){
                maior = vet[i];
                menor = vet[i];
            }else{
                if((vet[i] > maior)){
                    maior = vet[i];
                }
                if(vet[i]<menor){
                    menor = vet[i];
                }
            }
        }
        diferenca = (maior - menor);

        for(int i=0; i<vet.length; i++){
            if(vet[i]%2==0){
                if((vet[i] > maiorPar)){
                    maiorPar = vet[i];
                }
            }
            if(vet[i]%2!=0){
                totalImpares += vet[i];
                contImpar++;
            }
        }
        mediaImpares = totalImpares/contImpar;

        System.out.println("Media de Ímpares = "+mediaImpares);
        System.out.println("Maior número Par = "+maiorPar);
        System.out.println("Diferença = "+diferenca);
    }
}
