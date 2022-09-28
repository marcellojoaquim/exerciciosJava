package exercicio1;
// EXERCICIO 1
public class Transporte {
    
    private int id;
    private int ano;
    private String modelo;
    private double carga_maxima;
    private double potencia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCarga_maxima() {
        return carga_maxima;
    }

    public void setCarga_maxima(double carga_maxima) {
        this.carga_maxima = carga_maxima;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public Transporte(int id, int ano, String modelo, double carga_maxima, double potencia) {
        this.id = id;
        this.ano = ano;
        this.modelo = modelo;
        this.carga_maxima = carga_maxima;
        this.potencia = potencia;
    }

    public Transporte() {
    }

    public double consumo(double potencia, double carga_maxima){
        double consumo;
        this.potencia = potencia;
        this.carga_maxima = carga_maxima;
        consumo = (potencia*carga_maxima)*100;
        return consumo; 
    }

    public String leiaModelo(){
        return modelo;
    }
    
    public void gravaModelo(String modelo){
        this.modelo = modelo;
    }
    
}
