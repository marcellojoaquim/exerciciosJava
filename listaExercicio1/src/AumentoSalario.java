import java.util.Scanner;

//EXERCICIO 19
public class AumentoSalario {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario = 0;
        System.out.println("Digite o valor do salário:");
        salario = input.nextDouble();
        input.close();

        if(salario > 500){
            salario += (salario*0.1);
            System.out.printf("Salário corrigido: "+"%.2f",salario);
        }
        if((salario <= 500)&&(salario > 300)){
            salario += (salario*0.07);
            System.out.printf("Salário corrigido: "+"%.2f",salario);
        } if(salario < 300){
            salario += (salario*0.05);
            System.out.printf("Salário corrigido: "+"%.2f",salario);
        }
    }
}
