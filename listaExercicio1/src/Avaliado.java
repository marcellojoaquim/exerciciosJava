//EXERCICIO 25
import java.util.Scanner;

public class Avaliado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int interfaceGrafica, inteligenciaArtificail, encapsulamento, indentacao, structs;
//        int[] vet = new int[5];

        System.out.println("Informe se há os requisitos para o trabalho.");
        System.out.println("Sendo 1 para sim ou 0 p/ não.");
//        System.out.println("Deve ser preenchido para os requisitos espectivamente:" );
//        System.out.println("INTER GRAFICA, IA, ENCAPSULAMENTO, INDENTAÇÃO, STRUCTS");

        System.out.println("Sobre Interface Grafica");
        interfaceGrafica = input.nextInt();
        System.out.println("Sobre inteligencia artificail");
        inteligenciaArtificail = input.nextInt();
        System.out.println("Sobre encapsulamento");
        encapsulamento = input.nextInt();
        System.out.println("Sobre indentacao");
        indentacao = input.nextInt();
        System.out.println("Sobre structs");
        structs = input.nextInt();
        input.close();

        if((interfaceGrafica == 1 )|| (inteligenciaArtificail == 1)){
            System.out.println("Avaliado");
        } else if((encapsulamento==1)&&(indentacao==1)){
            System.out.println("Avaliado");
        }else if(structs==1){
            System.out.println("Avaliado");
        }else{
            System.out.println("0 (zero)");
        }

    }
}
