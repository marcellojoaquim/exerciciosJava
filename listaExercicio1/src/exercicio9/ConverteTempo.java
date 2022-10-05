// EXERCICIO 9
import java.util.Scanner;

public class ConverteTempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempo;
        System.out.println("Insira os segundos: ");
        tempo = sc.nextInt();

        System.out.println(" ");
        int horas = tempo / 3600;
        int minutos = (tempo - (horas * 3600)) / 60;
        int segundos = tempo - (horas * 3600) - (minutos * 60);

        System.out.println(horas+":"+minutos+":"+segundos);



       sc.close();
    }
}
