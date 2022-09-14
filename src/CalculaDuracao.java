// EXERCICIO 11
import java.util.Scanner;


public class CalculaDuracao{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horaInicial, horaFinal, duracao=0, dia=24;

        System.out.println("Informe a hora inicial:");
        horaInicial = input.nextInt();
        System.out.println("Informe a hora final:");
        horaFinal = input.nextInt();
        input.close();

        if((horaInicial==0)&&(horaFinal==0)){
            duracao = 24;
        }
        else if(horaInicial > horaFinal){
            dia -= horaInicial;
            duracao = dia + horaFinal;
        }
        else if(horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        }
            System.out.println("O Jogo durou: "+duracao+" hora(s)");
    }
}


