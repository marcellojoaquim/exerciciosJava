//EXERCICIO 31
import java.util.Scanner;

public class NotaValida {
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
        double nota1=0, nota2=0, media;

        System.out.println("Informe a primeira nota:");
        nota1 = input.nextDouble();
        while((nota1 < 0)||(nota1>10)){
            System.out.println("Nota inválida.");
            nota1 = input.nextDouble();
        }

        System.out.println("Iforme a segunda nota:");
        nota2 = input.nextDouble();
        while((nota2 < 0)||(nota2>10)){
            System.out.println("Nota inválida.");
            nota2 = input.nextDouble();
        }
        input.close();
        media = (nota1+nota2)/2;
        System.out.println("Média ="+media);

    }
}
