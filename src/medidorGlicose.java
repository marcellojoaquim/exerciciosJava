//EXERCICIO 27
import java.util.Scanner;

public class medidorGlicose {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] medicoes = new int[4];
        int cont=1;
        double total=0;
        double media;

        for(int i=0; i<medicoes.length; i++){
            System.out.println("Informe a "+cont+"º medição");
            medicoes[i] = input.nextInt();
            cont++;
        }
        input.close();

        for(int i=0; i <medicoes.length; i++){
            if(medicoes[i]<110){
                System.out.println(medicoes[i]+" NORMAL");
            }else if((medicoes[i]>=110)&&(medicoes[i]<=125)){
                System.out.println(medicoes[i]+" ALTERADA");
            }else if(medicoes[i]>125){
                System.out.println(medicoes[i]+" MUITO ALTA");
            }
            total += medicoes[i];
        }

        media = total/medicoes.length;
        System.out.println("Medias das Leituras ="+media);
    }
}
