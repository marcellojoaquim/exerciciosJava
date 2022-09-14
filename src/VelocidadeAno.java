import java.util.Scanner;

// EXERCICIO 21

public class VelocidadeAno {

        private int ano;
        private double velocidade;

        
        
        public double getVelocidade() {
            return velocidade;
        }
        public int getAno() {
            return ano;
        }
       
        public void setAno(int ano) {
            this.ano = ano;
        }
        public void setVelocidade(double velocidade) {
            this.velocidade = velocidade;
        }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aux=0, auxi =0;
        
        VelocidadeAno carros[] = new VelocidadeAno[3];
        
        
        for(int i =0; i<carros.length; i++){
            carros[i] = new VelocidadeAno();
            System.out.println("Informe o ano do carro: ");
            carros[i].setAno(input.nextInt());
            System.out.println("Informe a velocidade do carro: ");
            carros[i].setVelocidade(input.nextDouble());
        }
        input.close();

        for(int i =0; i<carros.length; i++){
            
            if(carros[i].getAno() > carros[aux].getAno()){
                aux = i;
            }
        }
        for(int i =0; i<carros.length; i++){
            
            if(carros[i].getVelocidade() > carros[auxi].getVelocidade()){
                auxi = i;
            }
        }
        System.out.println("Ano do carro mais novo = " +carros[aux].getAno());
        System.out.println("Velocidade do mais rápido = " +carros[auxi].getVelocidade());
    }
    
}
