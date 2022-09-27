//EXERCICIO 45
import java.util.Scanner;

public class NomeIdade {
    
    String nome;
    float idade;

    public static void main(String[] args) {
        int maiorIdade=0, menorIdade=0;
        float media=0, soma=0;
        String pessoaNova = "";
        Scanner input = new Scanner(System.in);
        NomeIdade[] pessoas = new NomeIdade[5];

        System.out.println("Informe os nomes e idades das cinco pessoas");
        
        for(int i=0; i<pessoas.length; i++){
            pessoas[i] = new NomeIdade();
            pessoas[i].nome = input.next();
            pessoas[i].idade = input.nextFloat();
        }
        input.close();

        for(int i=0; i<pessoas.length; i++){
            if(i==0){
                maiorIdade =(int) pessoas[i].idade;
                menorIdade = (int) pessoas[i].idade;
            }else{
                if((pessoas[i].idade > maiorIdade)){
                    maiorIdade = (int) pessoas[i].idade;
                }
                
                if(pessoas[i].idade<menorIdade){
                    menorIdade = (int) pessoas[i].idade;
                    pessoaNova = pessoas[i].nome;
                }
            }
        }

        for(int i=0; i<pessoas.length; i++){
            soma += pessoas[i].idade;
        }
        media = soma/pessoas.length;

        System.out.println("Maior idade = "+maiorIdade);
        System.out.println("Nome da pessoa mais nova = "+pessoaNova);
        System.out.println("Media da idades = "+media);
    }
}
